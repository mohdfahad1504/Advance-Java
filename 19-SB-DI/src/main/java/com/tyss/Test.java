package com.tyss;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main(String[] args) {
		
		 ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		 
		 Employee emp = (Employee) app.getBean("empId");
		 
		 System.out.println(emp);
		 
		 Student student = app.getBean("studentBean", Student.class);
		 student.display();
		 
		 app.close();
		 
	}
}
