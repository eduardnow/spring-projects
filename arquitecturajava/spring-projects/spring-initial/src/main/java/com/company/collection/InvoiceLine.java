package com.company.collection;

public class InvoiceLine {

	private int number;

	private String concept;

	private String amount;

	public InvoiceLine() {
		super();
	}

	public InvoiceLine(int number, String concept, String amount) {
		super();
		this.number = number;
		this.concept = concept;
		this.amount = amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
