package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.entity.Employee;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Employee emp = new Employee();
		emp.setEid(103);
		emp.setName("Zingi");
		emp.setEmail("zingi@gmail.com");
		emp.setSalary(60000);

		et.begin();
		em.persist(emp);
		et.commit();

		System.out.println("saved");
		
	}
}
