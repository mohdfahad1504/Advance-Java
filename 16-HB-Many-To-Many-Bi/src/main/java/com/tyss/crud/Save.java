package com.tyss.crud;

import java.util.Arrays;
import java.util.List;

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

		Movie movie = new Movie(5, "pathan");
		Actor a1 = new Actor(77, "John", 40);
		Actor a2 = new Actor(88, "Asutosh rana", 65);

		a1.setMovies(Arrays.asList(movie));
		a2.setMovies(Arrays.asList(movie));

		et.begin();
		if (em.find(Actor.class, 77) == null) {
			em.persist(a1);
		}
		
		if (em.find(Actor.class, 88) == null) {
			em.persist(a2);
		}
		
		if (em.find(Movie.class, 5) == null) {
			movie.setActors(Arrays.asList(a1, a2));
			em.persist(movie);
		} else {
			List<Actor> actors = em.find(Movie.class, 5).getActors();
			actors.add(a1);
			actors.add(a2);
			movie.setActors(actors);
			em.merge(movie);
		}
		et.commit();

		System.out.println("Saved.");

	}
}
