package com.tyss.list;

import java.util.List;

public class Student {

	String name;
	List<String> subjects;
	
	public Student() {	}

	public Student(String name, List<String> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void display() {
		System.out.println("-----Student------");
		System.out.println("Name : " + name);
		System.out.println("-----Subjects-----");
		System.out.println(subjects);
	}
	
}
