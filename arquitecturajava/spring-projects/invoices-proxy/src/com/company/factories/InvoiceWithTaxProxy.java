package com.company.factories;

public class InvoiceWithTaxProxy extends Invoice {
	
	private Invoice invoice;

	public InvoiceWithTaxProxy(InvoiceWithTax invoice) {
		super();
		this.invoice = invoice;
	}

	@Override
	public double getAmountTotal() {
		
		System.out.println("Invoice with tax created");

		return invoice.getAmountTotal();
	}

	public int getNumber() {
		return invoice.getNumber();
	}

	public void setNumber(int number) {
		invoice.setNumber(number);
	}

	public String getConcept() {
		return invoice.getConcept();
	}

	public void setConcept(String concept) {
		invoice.setConcept(concept);
	}

	public double getAmount() {
		return invoice.getAmount();
	}

	public void setAmount(double amount) {
		invoice.setAmount(amount);
	}
	
	

}
