package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Account;

public class UpdateAccount {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Account account = em.find(Account.class, 4455L);
		if (account != null) {
			account.setAmount(60000);
			et.begin();
			em.merge(account);
			et.commit();
			System.out.println("Account Updated");
		} else {
			System.out.println("Not Found");
		}
		
	}
}
