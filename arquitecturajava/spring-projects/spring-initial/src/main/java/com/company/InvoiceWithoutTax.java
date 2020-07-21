package com.company;

class InvoiceWithoutTax extends Invoice {

	public InvoiceWithoutTax(int number, String concept, double amount) {
		super(number, concept, amount);
	}

	public InvoiceWithoutTax() {
	}

	@Override
	public double getAmountTotal() {
		return this.getAmount();
	}

}
