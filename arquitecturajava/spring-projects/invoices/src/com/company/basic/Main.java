package com.company.basic;

public class Main {

	public static void main(String[] args) {
		
		InvoiceWithTax invoiceWithTax = new InvoiceWithTax(1, "Computer", 200);
		System.out.println(invoiceWithTax.getAmountTotal());
		
		InvoiceWithoutTax invoiceWithoutTax = new InvoiceWithoutTax(1, "Computer", 200);
		System.out.println(invoiceWithoutTax.getAmountTotal());
		
		print(invoiceWithTax);
		print(invoiceWithoutTax);
		
	}
	
	public static void print(Invoice invoice) {
		
		System.out.println("***************************");
		System.out.println(invoice.getAmountTotal());
		System.out.println("***************************");
		
	}

}
