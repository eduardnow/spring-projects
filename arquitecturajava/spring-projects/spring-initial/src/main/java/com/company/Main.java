package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	private static final String PATH_APP_CONTEXT = "src/main/resources/applicationContext.xml";

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new FileSystemXmlApplicationContext(PATH_APP_CONTEXT);
		Invoice invoiceWithTax = context.getBean(InvoiceWithTax.class);
		invoiceWithTax.setNumber(1);
		invoiceWithTax.setConcept("Computer");
		invoiceWithTax.setAmount(250);
		System.out.println(invoiceWithTax.getConcept());
		System.out.println(invoiceWithTax.getAmountTotal());

	}

}
