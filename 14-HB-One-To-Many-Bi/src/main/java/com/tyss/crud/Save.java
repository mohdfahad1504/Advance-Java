package com.tyss.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Account;
import com.tyss.entity.Bank;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank bank = new Bank(4, "Union", "kanpur");

		Account a1 = new Account(3344, "P", 10024);
		Account a2 = new Account(4455, "Q", 50000);
		Account a3 = new Account(6677, "R", 20050);

//		List<Account> accounts = new ArrayList<Account>();
//		accounts.add(a1);
//		accounts.add(a2);
//		accounts.add(a3);
//		bank.setAccounts(accounts);
		a1.setBank(bank);
		a2.setBank(bank);
		a3.setBank(bank);
		bank.setAccounts(Arrays.asList(a1, a2, a3));

		et.begin();
		em.persist(bank);
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
		et.commit();

		System.out.println("saved");
	}
}
