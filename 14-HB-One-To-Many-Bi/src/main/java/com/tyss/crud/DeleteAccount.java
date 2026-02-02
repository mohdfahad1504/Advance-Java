package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Account;

public class DeleteAccount {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Account account = em.find(Account.class, 6677L);
		if (account != null) {
			et.begin();
			em.remove(account);
			et.commit();
			System.out.println("Account Deleted");
		} else {
			System.out.println("Not Found");
		}
		
	}
}
