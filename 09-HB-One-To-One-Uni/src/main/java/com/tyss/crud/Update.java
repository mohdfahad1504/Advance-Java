package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Car;
import com.tyss.entity.Engine;

public class Update {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = em.find(Car.class, 4);
		car.setPrice(500000);
		
		Engine engine = car.getEngine();
		engine.setCc(2500);
		
		car.setEngine(engine);
		
		et.begin();
		em.merge(car);
		et.commit();
		
		System.out.println("Updated");
		
	}
}
