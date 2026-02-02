package com.tyss.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.entity.Account;
import com.tyss.entity.Bank;

public class FetchByBank {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Bank bank = em.find(Bank.class, 1);
		
		if(bank != null) {
			
			System.out.println("--------Bank----------");
			System.out.println(bank.getBid());
			System.out.println(bank.getName());
			System.out.println(bank.getAddress());
			
			List<Account> accounts = bank.getAccounts();
			if(accounts.size() > 0) {
				System.out.println("--------Accounts--------");
				for(Account account : accounts) {
					System.out.println(account.getAccno());
					System.out.println(account.getName());
					System.out.println(account.getAmount());
					System.out.println("----------------------");
				} 
			} else {
				System.out.println("No Accounts");
			}
			
		} else {
			System.out.println("Not Found");
		}
		
	}
}
