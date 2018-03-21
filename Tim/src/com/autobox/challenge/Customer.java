package com.autobox.challenge;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Double> transactions;

	public Customer(String name, double initalAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initalAmount);
	}

	public void addTransaction(double amount) {
		this.transactions.add(amount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}

}
