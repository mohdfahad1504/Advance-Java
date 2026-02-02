package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Engine;

public class DeleteEngine {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine engine = em.find(Engine.class, 44);
		
		if(engine != null) {
			et.begin();
			em.remove(engine);
			et.commit();
			System.out.println("Deleted"); // Can not Delete mapped Engine
		} else {
			System.out.println("Record Not Found");
		}
		
	}
}
