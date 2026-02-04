package com.tyss.map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("mapConfig.xml");
		
		Shop shop1 = app.getBean("shopSetterBean", Shop.class);
		shop1.display();
		
		System.out.println("========================================");
		
		Shop shop2 = app.getBean("shopConstructorBean", Shop.class);
		shop2.display();
		
		app.close();
		
	}
	
}
