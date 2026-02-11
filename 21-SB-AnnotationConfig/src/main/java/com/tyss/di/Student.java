package com.tyss.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Constructor Injection
@Component
public class Student {

	private String name;
	private long phone;
	
	public Student(@Value(value = "Manga") String name, @Value(value = "8765432109") long phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
	}

}
