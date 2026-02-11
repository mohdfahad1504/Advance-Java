package com.tyss.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value(value = "500")
	private int cc;
	
	public int getCc() {
		return cc;
	}
	
	public void start() {
		System.out.println("engine started");
	}
	
}
