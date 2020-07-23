package com.company.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurator {

	@Bean
	public Person getPerson() {
		Person person = new Person();
		person.setName("John");
		
		return person;
	}
	
}
