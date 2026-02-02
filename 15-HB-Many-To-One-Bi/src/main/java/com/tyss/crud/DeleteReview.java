package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Review;

public class DeleteReview {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Review review = em.find(Review.class, 12);
		if (review != null) {
			et.begin();
			em.remove(review);
			et.commit();
			System.out.println("Review Deleted");
		} else {
			System.out.println("Not Found");
		}
	}
}
