package com.company.basic;

public class InvoiceWithTax extends Invoice {

	public InvoiceWithTax(int number, String concept, double amount) {
		super(number, concept, amount);
	}

	private static final double TAX = 1.21;

	@Override
	public double getAmountTotal() {
		return this.getAmount() * TAX;
	}

}
