package com.tyss.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	private String name;
	private double salary;
	private String email;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int id) {
		this.eid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void showRecord() {
		System.out.println("Employee Id : " + this.eid);
		System.out.println("Employee Name : " + this.name);
		System.out.println("Employee Email : " + this.email);
		System.out.println("Employee Salary : " + this.salary);
	}
	
}
