package com.arrayList.challenge;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone myphone = new MobilePhone();

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
				myphone.printContactList();
				break;
			case 2:
				addContact();
				break;
			case 3:
				modifyContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				searchForContact();
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
		System.out.println("\t 1 - To print the Contact List.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void addContact() {
		System.out.println("Enter the name ");
		String name = scanner.nextLine();
		System.out.println("Enter the phone number ");
		String number = scanner.nextLine();
		Contact newcontact = Contact.createnewContact(name, number);
		if (myphone.addNewContact(newcontact)) {
			System.out.println("Contact got added to the list");
		} else {
			System.out.println("Contact already exists, hence couldnt add");
		}

	}

	public static void modifyContact() {
		System.out.println("Enter the old name ");
		String oldName = scanner.nextLine();
		System.out.println("Enter the new name ");
		String newName = scanner.nextLine();
		System.out.println("Enter the phone number ");
		String number = scanner.nextLine();
		if (myphone.modifyContact(oldName, newName, number)) {
			System.out.println("the contact : " + oldName + " was modified with new contact : " + newName);
		} else {
			System.out.println("the contact : " + oldName + " was not found");
		}

	}

	public static void removeContact() {
		System.out.println("Enter the name ");
		String name = scanner.nextLine();
		if (myphone.removeContact(name)) {
			System.out.println("Contact was removed");
		} else {
			System.out.println("Contact was not found");
		}

	}

	public static void searchForContact() {
		System.out.println("Enter the name ");
		String name = scanner.nextLine();
		if (myphone.findItem(name) >= 0) {
			System.out.println("the contact : " + name + " was found in the list");
		} else {
			System.out.println("the contact : " + name + " was not found in the list");
		}

	}

}
