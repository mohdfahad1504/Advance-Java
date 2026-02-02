package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Engine;

public class UpdateEngine {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine engine = em.find(Engine.class, 44);
		if (engine != null) {
			engine.setCc(3500);
			et.begin();
			em.merge(engine);
			et.commit();
			System.out.println("Updated");
		} else {
			System.out.println("Not Found");
		}
				
	}
}
