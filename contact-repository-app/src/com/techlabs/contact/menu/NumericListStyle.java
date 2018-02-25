package com.techlabs.contact.menu;

import java.util.List;

import com.techlabs.contact.Contact;

public class NumericListStyle implements IDisplayStyle {

	@Override
	public void display() {
		System.out.println("1.View all contact\n" + "2.Add new contact\n"
				+ "3.Search by id\n" + "4.Update contact by id\n"
				+ "5.Delete contact by id\n" + "6.Exit");
	}

	@Override
	public int checkOption(int option) {
		if (option > 0 && option < 7)
			return option;
		return -1;
	}

	@Override
	public void displayContact(Contact contact) {
		System.out.println("========================================"
				+ "=======================================");
		System.out.println("ID\tFirst Name\tLast Name\t"
				+ "Location\tPhoneNumber\tEmailId");
		System.out.println("=========================================="
				+ "=====================================");

		System.out.println(contact.getId() + "\t" + contact.getFirstName()
				+ "\t\t" + contact.getLastName() + "\t\t"
				+ contact.getLocation() + "\t\t" + contact.getPhoneNumber()
				+ "\t" + contact.getEmailId());
		System.out.println("========================================"
				+ "=======================================");
	}

	@Override
	public void displayAll(List<Contact> contacts) {
		System.out.println("========================================"
				+ "=======================================");
		System.out.println("ID\tFirst Name\tLast Name\t"
				+ "Location\tPhoneNumber\tEmailId");
		System.out.println("=========================================="
				+ "=====================================");
		for (Contact contact : contacts) {
			System.out.println(contact.getId() + "\t" + contact.getFirstName()
					+ "\t\t" + contact.getLastName() + "\t\t"
					+ contact.getLocation() + "\t\t" + contact.getPhoneNumber()
					+ "\t" + contact.getEmailId());
		}
		System.out.println("========================================"
				+ "=======================================");
	}

}
