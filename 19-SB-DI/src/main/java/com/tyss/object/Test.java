package com.tyss.object;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("objectConfig.xml");
		
		Car bean1 = (Car) app.getBean("carSetterBean");
		bean1.drive();
		
		System.out.println("===============================");
		
		Car bean2 = app.getBean("carConstructorBean", Car.class);
		bean2.drive();
		
		app.close();
		
	}

}
