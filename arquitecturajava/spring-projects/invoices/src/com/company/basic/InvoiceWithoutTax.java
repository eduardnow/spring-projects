package com.company.basic;

public class InvoiceWithoutTax extends Invoice {

	public InvoiceWithoutTax(int number, String concept, double amount) {
		super(number, concept, amount);
	}

	@Override
	public double getAmountTotal() {
		return this.getAmount();
	}

}
