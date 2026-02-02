package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Bank;

public class UpdateBank {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank bank = em.find(Bank.class, 4);
		if(bank != null) {
			bank.setAddress("Lucknow");
			et.begin();
			em.merge(bank);
			et.commit();
			System.out.println("Record Updated.");
		} else {
			System.out.println("Not Found");
		}
		
	}
}
