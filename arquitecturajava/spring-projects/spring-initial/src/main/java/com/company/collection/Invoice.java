package com.company.collection;

import java.util.ArrayList;
import java.util.List;

public abstract class Invoice {

	private int number;

	private String concept;

	private double amount;

	private List<InvoiceLine> lines = new ArrayList<>();

	public Invoice() {
		super();
	}

	public Invoice(int number, String concept, double amount, List<InvoiceLine> lines) {
		super();
		this.number = number;
		this.concept = concept;
		this.amount = amount;
		this.lines = lines;
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

	public List<InvoiceLine> getLines() {
		return lines;
	}

	public void setLines(List<InvoiceLine> lines) {
		this.lines = lines;
	}

	public abstract double getAmountTotal();

}
