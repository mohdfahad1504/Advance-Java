package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Bank;

public class DeleteBank {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank bank = em.find(Bank.class, 4);
		
		if (bank != null) {
			et.begin();
			em.remove(bank);
			et.commit();
			System.out.println("Deleted");
		} else {
			System.out.println("Not Found");
		}
	}
}
