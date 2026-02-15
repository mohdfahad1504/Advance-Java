package com.tyss.list;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.tyss.list")
public class AppConfig {

	@Bean
	public List<String> getAddresses() {

//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Thane");
//		list.add("Mumbra");
//		
//		return list;

		return Arrays.asList("Thane", "Mumbra", "Bandra");
	}
	
	@Bean(value = "adharBean")
	@Scope(value = "prototype")
	public Adhar getAdhar() {
		return new Adhar();
	}
}
