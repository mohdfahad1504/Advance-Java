package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Car;
import com.tyss.entity.Engine;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = new Car(4, "Mno", 2500000);

		Engine engine = new Engine(44, "D", 2900);

		car.setEngine(engine);
		//engine.setCar(car);

		et.begin();
		em.persist(car);
		//em.persist(engine);
		et.commit();

		System.out.println("saved");
		
	}
}
