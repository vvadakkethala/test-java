package com.autobox.challenge;

import java.util.ArrayList;

public class Bank {

	private String bankName;
	private ArrayList<Branch> branchlist;

	public Bank(String bankName) {
		this.bankName = bankName;
		this.branchlist = new ArrayList<Branch>();
	}

	public boolean addNewBranch(String branchame) {
		if (findBranch(branchame) == null) {
			this.branchlist.add(new Branch(branchame));
			return true;
		} else {

			return false;
		}
	}

	public boolean addCustomerToBranch(String branchName, String customerName, double initialamount) {
		if (findBranch(branchName) == null) {
			return false;
		} else {
			findBranch(branchName).addNewCustomer(customerName, initialamount);
			return true;
		}

	}

	public void listCustomer(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer details for branch " + branch.getBranchname());

			ArrayList<Customer> branchCustomers = branch.getCustomer();
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
				if (showTransactions) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for (int j = 0; j < transactions.size(); j++) {
						System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
					}
				}
			}

		}

	}

	public boolean addTransactonToCustomerInBranch(String branchName, String customer, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			ArrayList<Customer> branchCustomers = branch.getCustomer();
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer foundCustomer = branchCustomers.get(i);
				if (foundCustomer.getName().equals(customer)) {
					foundCustomer.addTransaction(amount);
					return true;
				}
			}
		}
		return false;
	}

	public boolean searchForCustomer(String customername) {
		for (int i = 0; i < this.branchlist.size(); i++) {
			ArrayList<Customer> branchCustomers = this.branchlist.get(i).getCustomer();
			for (int j = 0; j < branchCustomers.size(); j++) {
				if (branchCustomers.get(j).getName().equals(customername)) {
					return true;
				}
			}
		}

		return false;
	}

	public int findBranch(Branch branchname) {
		return this.branchlist.indexOf(branchname);
	}

	public Branch findBranch(String branchname) {
		for (int i = 0; i < this.branchlist.size(); i++) {
			Branch checkedBranch = this.branchlist.get(i);
			if (checkedBranch.getBranchname().equals(branchname)) {
				return checkedBranch;
			}
		}
		return null;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public ArrayList<Branch> getBranchlist() {
		return branchlist;
	}

	public void setBranchlist(ArrayList<Branch> branchlist) {
		this.branchlist = branchlist;
	}

}
