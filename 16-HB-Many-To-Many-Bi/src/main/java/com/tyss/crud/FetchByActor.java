package com.tyss.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.entity.Actor;
import com.tyss.entity.Movie;

public class FetchByActor {
	 public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Actor actor = em.find(Actor.class, 11);
		
		if (actor != null) {
			System.out.println("------Actor------");
			System.out.println(actor.getAid());
			System.out.println(actor.getName());
			System.out.println(actor.getAge());
			
			List<Movie> movies = actor.getMovies();
			System.out.println("-----Movies------");
			for(Movie m : movies) {
				System.out.println(m.getMid());
				System.out.println(m.getTitle());
				System.out.println("---------------------");
			}
		} else {
			System.out.println("Not Found");
		}
		
	}
}
