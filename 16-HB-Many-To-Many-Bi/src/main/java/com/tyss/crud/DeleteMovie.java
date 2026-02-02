package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Movie;

public class DeleteMovie {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Movie movie = em.find(Movie.class, 6);
		if (movie != null) {
			et.begin();
			em.remove(movie); 
			et.commit();
			System.out.println("Deleted");
		} else {
			System.out.println("Not Found");
		}
		
		
	}
}
