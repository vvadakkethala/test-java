package com.autobox.challenge;

import java.util.Scanner;

public class Main {

	private static Bank bank1 = new Bank("bank1");
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;

		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				addNewCustomerToBranch();
				break;
			case 2:
				addTransaction();
				break;
			case 3:
				addNewBranch();
				break;
			case 4:
				showListOfCustomers();
				break;
			case 5:
				searchForCustomer();
				break;
			case 6:
				quit = true;
				break;
			}
		}
	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To add a new customer to a branch");
		System.out.println("\t 2 - To add additional transactions for a customer/branch");
		System.out.println("\t 3 - To add a new branch in a bank");
		System.out.println("\t 4 - To show a list of customers of a branch");
		System.out.println("\t 5 - To search for an customer in a branch");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void addNewCustomerToBranch() {

		System.out.println("Enter the branch name");
		String branchName = scanner.nextLine();
		System.out.println("Enter the customer name");
		String customerNAme = scanner.nextLine();
		System.out.println("Enter the intial amount");
		double initialamount = scanner.nextDouble();
		if (bank1.addCustomerToBranch(branchName, customerNAme, initialamount)) {
			System.out.println("Customer with name " + customerNAme + " was added");
		} else {
			System.out.println("Customer name could not be added");
		}
	}

	public static void addTransaction() {

		System.out.println("Enter the branch name");
		String branchName = scanner.nextLine();
		System.out.println("Enter the customer name");
		String customerNAme = scanner.nextLine();
		System.out.println("Enter the amount");
		double amount = scanner.nextDouble();
		if (bank1.addTransactonToCustomerInBranch(branchName, customerNAme, amount)) {
			System.out.println("transaction : " + amount + " was added to the customer : " + customerNAme);
		} else {
			System.out.println("transaction could not be added");
		}

	}

	public static void addNewBranch() {
		System.out.println("Enter the branch name");
		String branchName = scanner.nextLine();
		if (bank1.addNewBranch(branchName)) {
			System.out.println("branchName " + branchName + " was added");
		} else {
			System.out.println("the branch " + branchName + " could not be added");
		}
	}

	public static void showListOfCustomers() {
		System.out.println("Enter the branch name");
		String branchName = scanner.nextLine();
		System.out.println("Do you want to see the transactions");
		boolean answer = scanner.nextBoolean();
		bank1.listCustomer(branchName, answer);
	}

	public static void searchForCustomer() {
		System.out.println("Enter the customer name");
		String customerNAme = scanner.nextLine();
		if (bank1.searchForCustomer(customerNAme)) {
			System.out.println("the customer name : " + customerNAme + " found");
		} else {
			System.out.println("customer name was not found");
		}
	}

}
