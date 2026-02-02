package com.tyss;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	 public static void main(String[] args) {
		
		 ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		 
		 Employee emp = (Employee) app.getBean("empId");
		 
		 System.out.println(emp);
		 
		 app.close();
		 
	}
}
