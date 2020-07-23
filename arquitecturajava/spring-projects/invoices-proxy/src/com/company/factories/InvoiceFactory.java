package com.company.factories;

public class InvoiceFactory {

	private static final Object TAX = "TAX";

	public static Invoice getInstance(String type) {
		return getInvoice(type);
	}

	public static Invoice getInstance() {
		return getInvoice("");
	}

	private static Invoice getInvoice(String type) {
		if (type.equals(TAX)) {
			return new InvoiceWithTaxProxy(new InvoiceWithTax());
		}

		return new InvoiceWithoutTax();
	}

}
