package com.techlabs.contact.core;

import java.util.List;

import com.techlabs.contact.Contact;

public interface IRepository {

	public List<Contact> viewAllContact();

	public Contact viewContact(Contact contact);

	public void add(Contact newContact);

	public Boolean updateById(int id, Contact updateContact);

	public Contact searchById(int id);

	public Boolean deleteById(int id);

	public Boolean commit();
}
