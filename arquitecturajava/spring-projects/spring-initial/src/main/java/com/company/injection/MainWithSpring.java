package com.company.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainWithSpring {
	
	private static final String PATH_APP_CONTEXT = "src/main/resources/applicationContext.xml";

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new FileSystemXmlApplicationContext(PATH_APP_CONTEXT);
		Person person = context.getBean(Person.class);
		
		System.out.println(person.getName());
		System.out.println(person.getInvoice().getConcept());
		System.out.println(person.getInvoice().getAmountTotal());

	}

}
