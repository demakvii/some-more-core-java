package com.techlabs.serialization.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.serialization.Account;

public class TestSerialization {

	public static void main(String[] args) {

		Account account = new Account(101, "Mayur", 1000);
		account.deposit(1000);
		account.withdraw(500);
		saveState(account);
		// getState();
	}

	private static void getState() {

		try {
			FileInputStream inputStream = new FileInputStream("obj.bin");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					inputStream);
			Object accObject = objectInputStream.readObject();
			Account account = (Account) accObject;
			objectInputStream.close();
			inputStream.close();
			System.out.println(account);
		} catch (Exception ex) {

		}

	}

	private static void saveState(Account account) {
		try {
			FileOutputStream fs = new FileOutputStream("obj.bin");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(account);
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
