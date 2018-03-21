package com.autobox.challenge;

import java.util.ArrayList;

public class Branch {

	private String branchname;
	private ArrayList<Customer> customer;

	public Branch(String branchName) {
		this.branchname = branchName;
		this.customer = new ArrayList<Customer>();
	}

	public boolean addNewCustomer(String customerName, double initialAmount) {
		if (findCustomer(customerName) >= 0) {
			return false;
		} else {
			this.customer.add(new Customer(customerName, initialAmount));
			return true;
		}

	}

	public boolean addTransactions(Customer customer, double amount) {
		if (findCustomer(customer.getName()) >= 0) {
			customer.addTransaction(amount);
			return true;
		} else {
			return false;
		}
	}

	public int findCustomer(String name) {
		for (int i = 0; i < this.customer.size(); i++) {
			if (this.customer.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public int findCustomer(Customer customer) {
		return this.customer.indexOf(customer);
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(ArrayList<Customer> customer) {
		this.customer = customer;
	}

}
