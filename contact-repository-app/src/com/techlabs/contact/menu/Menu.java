package com.techlabs.contact.menu;

import java.util.List;

import com.techlabs.contact.Contact;

public class Menu {
	IDisplayStyle displayStyle;

	public Menu(IDisplayStyle displayStyle) {

		this.displayStyle = displayStyle;
	}

	public int checkOption(int option) {
		return displayStyle.checkOption(option);
	}

	public void display() {
		displayStyle.display();
	}

	public void displayContact(Contact contact) {
		displayStyle.displayContact(contact);
	}

	public void displayAll(List<Contact> contacts) {
		displayStyle.displayAll(contacts);
	}
}
