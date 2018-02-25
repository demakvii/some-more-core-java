package com.techlabs.contact.core;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.contact.Contact;

public class ListFileRepository implements IRepository {

	List<Contact> contactList;
	IDataFile dataFile;

	public ListFileRepository(IDataFile dataFile) {
		contactList = new ArrayList<Contact>();
		this.dataFile = dataFile;
		contactList = dataFile.load();

	}

	public int find(int id) {
		int pos = 0;
		for (Contact contact : contactList) {

			if (contact.getId() == id)
				return pos;
			++pos;
		}
		return -1;
	}

	@Override
	public void add(Contact newContact) {
		contactList.add(newContact);
	}

	@Override
	public Boolean updateById(int id, Contact updateContact) {
		if (find(id) != -1) {
			contactList.remove(find(id));
			contactList.add(updateContact);
			return true;
		}
		return false;
	}

	@Override
	public Contact searchById(int id) {
		if (find(id) != -1) {
			return contactList.get(find(id));
		}
		return null;
	}

	@Override
	public String toString() {
		return "ListFileRepository [contactList=" + contactList + "]\n";
	}

	@Override
	public Boolean deleteById(int id) {
		if (find(id) != -1) {
			contactList.remove(find(id));
			return true;
		}
		return false;
	}

	@Override
	public Boolean commit() {
		if (dataFile.commit(contactList))
			return true;
		else
			return false;

	}

	@Override
	public List<Contact> viewAllContact() {
		return contactList;
	}

	@Override
	public Contact viewContact(Contact contact) {
		return contact;
	}
}
