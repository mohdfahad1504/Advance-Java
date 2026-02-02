package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Product;
import com.tyss.entity.Review;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product product = new Product(44, "TV", 20000, "Android With Wi-Fi");
		
		Review r1 = new Review("Good");
		Review r2 = new Review("Average");
		Review r3 = new Review("Quite Good");
		
		r1.setProduct(product);
		r2.setProduct(product);
		r3.setProduct(product);
		
		et.begin();
		em.persist(product);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		et.commit();
		
		System.out.println("Saved.");
		
	}
}
