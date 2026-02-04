package com.tyss.object;

public class Engine {
	
	int cc;

	public void start() {
		System.out.println("engine started");
	}
	
	public Engine() { }

	public Engine(int cc) {
		this.cc = cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
