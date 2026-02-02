package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Product;

public class UpdateProduct {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product product = em.find(Product.class, 44);
		if (product != null) {
			product.setPrice(21000);
			et.begin();
			em.merge(product);
			et.commit();
			System.out.println("Product Updated");
		} else {
			System.out.println("Not Found");
		}
		
	}
}
