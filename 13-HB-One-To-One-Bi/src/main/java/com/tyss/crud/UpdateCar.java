package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Car;

public class UpdateCar {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = em.find(Car.class, 4);
		if (car != null) {
			car.setPrice(500000);
			et.begin();
			em.merge(car);
			et.commit();
			System.out.println("Updated");
		} else {
			System.out.println("Not Found");
		}
				
	}
}
