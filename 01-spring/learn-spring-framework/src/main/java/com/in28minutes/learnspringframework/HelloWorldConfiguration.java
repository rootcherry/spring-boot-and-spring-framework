package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configure the things that we want Spring to manage
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "John";
	}
}
