package com.tyss.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("listConfig.xml");
		
		Student bean1 = (Student) app.getBean("studentSetterBean");
		bean1.display();
		
		Student bean2 = app.getBean("studentConstructorBean", Student.class);
		bean2.display();
		
		app.close();
		
	}

}
