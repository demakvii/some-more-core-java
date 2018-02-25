package com.techlabs.contact.menu;

import java.util.List;

import com.techlabs.contact.Contact;

public interface IDisplayStyle {
	public void display();

	public int checkOption(int option);

	public void displayContact(Contact contact);

	public void displayAll(List<Contact> contacts);
}
