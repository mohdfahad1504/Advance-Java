package com.tyss.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.entity.Product;
import com.tyss.entity.Review;

public class FetchByProduct {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Product product = em.find(Product.class, 44);
		if (product != null) {
			System.out.println("-------Product-------");
			System.out.println(product.getPid());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());
			
			List<Review> reviews = product.getReviews();
			System.out.println("--------Reviews-------");
			for (Review review : reviews) {
				System.out.println(review.getRid());
				System.out.println(review.getMsg());
				System.out.println("========================");
			}
		} else {
			System.out.println("Not Found");
		}
		
	}
}
