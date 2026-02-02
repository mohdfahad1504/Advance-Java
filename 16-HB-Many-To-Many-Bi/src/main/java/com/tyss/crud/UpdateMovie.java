package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Movie;

public class UpdateMovie {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Movie movie = em.find(Movie.class, 5);
		if (movie != null) {
			movie.setTitle("Pathaaan");
			et.begin();
			em.merge(movie);
			et.commit();
			System.out.println("Movie Updated");
		} else {
			System.out.println("Not Found");
		}
		
	}
}
