package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Car;
import com.tyss.entity.Engine;

public class DeleteEngine {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = em.find(Car.class, 4);
		
		if(car != null && car.getEngine() != null) {
			Engine engine = car.getEngine();
			et.begin();
			em.remove(car);
			em.remove(engine);
			et.commit();
			System.out.println("Deleted");
		} else {
			System.out.println("Record Not Found");
		}
		
	}
}
