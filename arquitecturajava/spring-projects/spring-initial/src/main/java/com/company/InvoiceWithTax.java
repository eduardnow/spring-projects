package com.company;

class InvoiceWithTax extends Invoice {

	public InvoiceWithTax(int number, String concept, double amount) {
		super(number, concept, amount);
	}

	public InvoiceWithTax() {
	}

	private static final double TAX = 1.21;

	@Override
	public double getAmountTotal() {
		return this.getAmount() * TAX;
	}

}
