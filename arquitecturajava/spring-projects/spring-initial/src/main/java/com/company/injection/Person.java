package com.company.injection;

import com.company.Invoice;

public class Person {

	private String name;
	
	private Invoice invoice;

	public Person(String name, Invoice invoice) {
		this.name = name;
		this.invoice = invoice;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
