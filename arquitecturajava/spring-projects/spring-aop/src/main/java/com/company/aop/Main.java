package com.company.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(Configurator.class);
		
		AppService app = context.getBean(AppService.class);
		
		app.message();
		
	}

}
