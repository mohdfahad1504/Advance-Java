package com.tyss.listOfObject;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("listOfObjectConfig.xml");
		
		Student student1 = app.getBean("studentSetterBean", Student.class);
		student1.display();
		
		System.out.println("========================================");
		
		Student student2 = app.getBean("studentConstructorBean", Student.class);
		student2.display();
		
		app.close();
		
	}
	
}
