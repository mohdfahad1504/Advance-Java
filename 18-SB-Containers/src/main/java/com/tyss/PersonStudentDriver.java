package com.tyss;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonStudentDriver {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("StudentPersonConfig.xml");
		
		Person person = (Person) app.getBean("personId");
		person.run();

		Student student = (Student) app.getBean("studentId");
		student.study();
		
		app.close();
		
	}
}
