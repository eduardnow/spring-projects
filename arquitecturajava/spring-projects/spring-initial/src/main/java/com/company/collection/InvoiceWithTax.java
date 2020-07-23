package com.company.collection;

class InvoiceWithTax extends Invoice {

	public InvoiceWithTax() {
	}

	private static final double TAX = 1.21;

	@Override
	public double getAmountTotal() {
		return this.getAmount() * TAX;
	}

}
