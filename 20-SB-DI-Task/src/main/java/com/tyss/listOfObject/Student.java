package com.tyss.listOfObject;

import java.util.List;

public class Student {

	String name;
	List<Subject> subjects;
	
	public Student() {	}

	public Student(String name, List<Subject> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void display() {
		System.out.println("--------Student---------");
		System.out.println("Name : " + name);
		System.out.println("---Subjects---");
		for(Subject subject : subjects) {
			System.out.println(subject);
		}
	}
	
}
