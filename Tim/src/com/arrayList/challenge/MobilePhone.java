package com.arrayList.challenge;

import java.util.ArrayList;

public class MobilePhone {

	private ArrayList<Contact> contactList;

	public MobilePhone() {
		this.contactList = new ArrayList<Contact>();
	}

	public void printContactList() {
		System.out.println("You have " + contactList.size() + " items in the list \n");
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println("name : " + contactList.get(i).getName() + " and phonenumber: "
					+ contactList.get(i).getPhonenumber());
		}
	}

	public boolean addNewContact(Contact contact) {
		if (findItem(contact.getName()) >= 0) {
			return false;
		} else
			contactList.add(contact);
		return true;
	}

	public boolean removeContact(String name) {
		int position = findItem(name);
		if (position > -1) {
			contactList.remove(position);
			return true;
		}

		return false;
	}

	public boolean modifyContact(String oldname, String newname, String newphonenumber) {
		int position = findItem(oldname);
		if (position < 0) {
			return false;
		} else {
			contactList.set(position, Contact.createnewContact(newname, newphonenumber));
			return true;
		}
	}

	public int findItem(Contact contact) {
		return contactList.indexOf(contact);
	}

	public int findItem(String name) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

}