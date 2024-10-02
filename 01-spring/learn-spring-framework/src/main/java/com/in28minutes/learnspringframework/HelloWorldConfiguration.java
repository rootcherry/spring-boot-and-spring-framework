package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};

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
		return new Person("Jane", 20, new Address("1428 Elm Street", "Springwood"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // name, age
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) { // name, age, address2
		return new Person(name, age, address3); // name, age
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Elm Street", "Springwood");
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("3600 Prospect Street NW", "Washington, D.C.");
	}
}
