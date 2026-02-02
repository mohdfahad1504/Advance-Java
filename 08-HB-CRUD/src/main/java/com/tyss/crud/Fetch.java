package com.tyss.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.entity.Employee;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, 103);
		if(emp != null) {
			emp.showRecord();
		} else {
			System.out.println("Record Not Found");
		}
	}
}
