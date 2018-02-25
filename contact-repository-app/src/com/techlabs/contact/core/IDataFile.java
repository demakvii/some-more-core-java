package com.techlabs.contact.core;

import java.util.List;

import com.techlabs.contact.Contact;

public interface IDataFile {
	public List<Contact> load();

	public Boolean commit(Object object);

}
