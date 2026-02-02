package com.tyss.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Account;
import com.tyss.entity.Bank;

public class UpdateAccount {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank bank = em.find(Bank.class, 4);
		if (bank != null && bank.getAccounts() != null) {
			List<Account> accounts = bank.getAccounts();
			int i = 0;
			int size = accounts.size();
			while (i < size && accounts.get(i).getAccno() != 6677) {
				i++;
			}
			
			if(i < size ) {
				accounts.get(i).setAmount(46000);
				bank.setAccounts(accounts);
				et.begin();
				em.merge(accounts.get(i));
				et.commit();
				
				System.out.println("Updated");
			} else {
				System.out.println("Not found");
			}
			
		} else {
			System.out.println("Not found");
		}
		
	}
}
