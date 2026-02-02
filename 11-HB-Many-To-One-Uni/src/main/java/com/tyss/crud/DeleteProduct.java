package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Product;
import com.tyss.entity.Review;

public class DeleteProduct {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Review review = em.find(Review.class, 10);
		if(review != null && review.getProduct() != null) {
			Product product = review.getProduct();
			review.setProduct(null);
			et.begin();   // problem
			em.remove(product);
			et.commit();
			System.out.println("Product Deleted");
		} else {
			System.out.println("Not Found");
		}
		
	}
}
