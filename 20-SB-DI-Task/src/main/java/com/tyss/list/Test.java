package com.tyss.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("listConfig.xml");
		
		Student bean1 = app.getBean("studentSetterBean", Student.class);
		bean1.display();
		
		System.out.println("=======================================");
		
		Student bean2 = app.getBean("studentConstructorBean", Student.class);
		bean2.display();
		
		app.close();
		
	}
	
}
