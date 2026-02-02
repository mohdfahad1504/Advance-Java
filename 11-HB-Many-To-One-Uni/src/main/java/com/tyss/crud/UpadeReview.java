package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Review;

public class UpadeReview {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Review review = em.find(Review.class, 10);
		if (review != null) {
			review.setMsg("Very Good");
			et.begin();
			em.merge(review);
			et.commit();
			System.out.println("Review Updataed");
		} else {
			System.out.println("Not Found");
		}
	}
}
