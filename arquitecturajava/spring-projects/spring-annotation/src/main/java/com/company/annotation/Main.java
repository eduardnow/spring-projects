package com.company.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(Configurator.class);
		
		Person person = context.getBean(Person.class);
		
		System.out.println(person.getName());

	}

}
