package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Actor;

public class UpdateActor {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Actor actor = em.find(Actor.class, 5); 
		if (actor != null) {
			actor.setAge(40);
			et.begin();
			em.merge(actor);
			et.commit();
			System.out.println("Actor Updated");
		} else {
			System.out.println("Not Found");
		}
	}
}
