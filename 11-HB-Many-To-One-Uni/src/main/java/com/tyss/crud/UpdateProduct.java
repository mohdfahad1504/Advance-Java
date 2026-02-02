package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Product;
import com.tyss.entity.Review;

public class UpdateProduct {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Review review = em.find(Review.class, 10);
		if(review != null && review.getProduct() != null) {
			Product product = review.getProduct();
			product.setPrice(22000);
			et.begin();
			em.merge(product);
			et.commit();
			System.out.println("Product Updated");
		} else {
			System.out.println("Not Found");
		}
		
	}
}
