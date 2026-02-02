package com.tyss.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Actor;
import com.tyss.entity.Movie;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Actor actor = new Actor(5, "DP", 35);
		
		Movie m1 = new Movie(11, "Jawan");
		Movie m2 = new Movie(77, "Pathan");
		
		actor.setMovies(Arrays.asList(m1, m2));
		
		et.begin();
		em.persist(actor);
		if(em.find(Movie.class, 11) == null) {
			em.persist(m1);
		}
		if(em.find(Movie.class, 77) == null) {
			em.persist(m2);
		}
		et.commit();
		
		System.out.println("Saved.");
		
	}
}
