package com.company.factories;

public abstract class Invoice {
	
	private int number;
	
	private String concept;
	
	private double amount;

	public Invoice() {
		super();
	}

	public Invoice(int number, String concept, double amount) {
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public abstract double getAmountTotal();

}
