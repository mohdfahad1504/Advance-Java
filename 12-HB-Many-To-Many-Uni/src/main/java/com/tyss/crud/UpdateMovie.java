package com.tyss.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Actor;
import com.tyss.entity.Movie;

public class UpdateMovie {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Actor actor = em.find(Actor.class, 5); 
		if (actor != null && actor.getMovies() != null) {
			List<Movie> movies = actor.getMovies();
			int i = 0;
			int size = movies.size();
			while(i < size && movies.get(i).getMid() != 77) {
				i++;
			}
			if(i < size ) {
				Movie m = movies.get(i);
				m.setTitle("PATHAN");
				actor.setMovies(movies);
				et.begin();
				em.merge(m);
				et.commit();
				System.out.println("Movie Updated");
			} else {
				System.out.println("Not Found");
			}
		} else {
			System.out.println("Not Found");
		}
	}
}
