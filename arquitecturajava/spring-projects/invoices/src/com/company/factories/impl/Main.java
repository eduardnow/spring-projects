package com.company.factories.impl;

import com.company.factories.Invoice;
import com.company.factories.InvoiceFactory;

public class Main {

	public static void main(String[] args) {
		
		Invoice invoiceWithTax = InvoiceFactory.getInstance("TAX");
		invoiceWithTax.setNumber(1);
		invoiceWithTax.setConcept("Computer");
		invoiceWithTax.setAmount(250);
		System.out.println(invoiceWithTax.getAmountTotal());
		
		Invoice invoiceWithoutTax = InvoiceFactory.getInstance();
		invoiceWithoutTax.setNumber(1);
		invoiceWithoutTax.setConcept("Computer");
		invoiceWithoutTax.setAmount(250);
		System.out.println(invoiceWithoutTax.getAmountTotal());
		
	}
	
}
