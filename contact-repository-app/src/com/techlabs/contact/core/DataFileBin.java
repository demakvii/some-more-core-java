package com.techlabs.contact.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.techlabs.contact.Contact;

public class DataFileBin implements IDataFile {

	@Override
	public List<Contact> load() {

		try {
			FileInputStream inputStream = new FileInputStream("obj.bin");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					inputStream);
			List<Contact> listContactObject = (List) objectInputStream
					.readObject();

			objectInputStream.close();
			inputStream.close();
			return listContactObject;

		} catch (Exception ex) {
		}
		return null;
	}

	@Override
	public Boolean commit(Object object) {
		try {
			FileOutputStream fs = new FileOutputStream("obj.bin");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(object);
			os.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

}
