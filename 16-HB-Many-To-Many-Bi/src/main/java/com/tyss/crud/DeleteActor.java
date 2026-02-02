package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Actor;

public class DeleteActor {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Actor actor = em.find(Actor.class, 66);
		if (actor != null) {
			et.begin();
			actor.setMovies(null);
			em.remove(actor);
			et.commit();
			System.out.println("Deleted");
		} else {
			System.out.println("Not Found");
		}
		
		
	}
}
