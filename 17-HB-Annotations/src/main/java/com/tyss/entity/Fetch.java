package com.tyss.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 =emf.createEntityManager();
		System.out.println("----------1-Entity Manager---------");
		User user1 = em1.find(User.class, 1);
		User user2 = em1.find(User.class, 1);
		User user3 = em1.find(User.class, 2);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		
		System.out.println("----------2-Entity Manager---------");
		User user4 = em2.find(User.class, 1);
		User user5 = em2.find(User.class, 1);
		User user6 = em2.find(User.class, 2);
		System.out.println(user4);
		System.out.println(user5);
		System.out.println(user6);
	}
}
