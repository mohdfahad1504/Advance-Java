package com.tyss;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CoreContainerDriver {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("StudentPersonConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Person person = (Person) factory.getBean("personId");
		person.run();
		
	}
}
