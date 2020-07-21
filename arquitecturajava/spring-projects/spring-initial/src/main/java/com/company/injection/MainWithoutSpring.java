package com.company.injection;

import com.company.Invoice;
import com.company.InvoiceFactory;

public class MainWithoutSpring {

	public static void main(String[] args) {

		Invoice invoice = InvoiceFactory.getInstance("TAX");
		invoice.setNumber(12541);
		invoice.setConcept("Tablet");
		invoice.setAmount(300);
		
		Person person = PersonFactory.getInstance();
		person.setName("John Doe");
		person.setInvoice(invoice);
		
		System.out.println(person.getName());
		System.out.println(person.getInvoice().getConcept());
		System.out.println(person.getInvoice().getAmountTotal());

	}

}
