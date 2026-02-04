package com.tyss.map;

import java.util.Map;

public class Shop {

	String name;
	Map<String, Double> items;
	
	public Shop() {	}

	public Shop(String name, Map<String, Double> items) {
		this.name = name;
		this.items = items;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setItems(Map<String, Double> items) {
		this.items = items;
	}
	
	public void display() {
		System.out.println("--------Shop--------");
		System.out.println("Name : " + name);
		System.out.println("---Items---");
		for(Map.Entry<String, Double> item : items.entrySet()) {
			System.out.println(item);
		}
	}
	
}
