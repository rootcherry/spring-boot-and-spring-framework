package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

record Address (String firstLine, String city) {};

// Configure the things that we want Spring to manage
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "John";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Jane", 20);
	}
	
	@Bean
	public Address address() {
		return new Address("Elm Street", "Springwood");
	}
}
