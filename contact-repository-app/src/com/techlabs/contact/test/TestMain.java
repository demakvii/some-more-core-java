package com.techlabs.contact.test;

import java.util.Scanner;

import com.techlabs.contact.Contact;
import com.techlabs.contact.core.DataFileBin;
import com.techlabs.contact.core.ListFileRepository;
import com.techlabs.contact.menu.Menu;
import com.techlabs.contact.menu.NumericListStyle;

public class TestMain {

	public static void main(String[] args) {

		Menu menu = new Menu(new NumericListStyle());

		ListFileRepository fileRepository = new ListFileRepository(
				new DataFileBin());

		int option = 0, id;

		Scanner sc = new Scanner(System.in);

		while (true && option != 6) {

			menu.display();
			System.out.println("Option:");

			option = menu.checkOption(sc.nextInt());

			switch (option) {

			case -1:
				System.out.println("Incorrect Option!");
				break;

			case 1:
				mainViewAllContact(fileRepository, menu);
				break;

			case 2:
				mainAdd(fileRepository);
				break;

			case 3:
				System.out.println("Enter id:");
				id = sc.nextInt();

				mainSearchContact(id, fileRepository, menu);
				break;

			case 4:
				System.out.println("Enter id:");
				id = sc.nextInt();

				mainUpdateContact(id, fileRepository);
				break;

			case 5:
				System.out.println("Enter id:");
				id = sc.nextInt();

				mainDeleteContact(id, fileRepository);
				break;

			case 6:
				mainCommit(fileRepository);
				System.out.println("ThankYou");
				break;

			}

		}

		sc.close();
	}

	private static void mainCommit(ListFileRepository fileRepository) {
		fileRepository.commit();

	}

	private static void mainDeleteContact(int id,
			ListFileRepository fileRepository) {
		if (fileRepository.deleteById(id)) {
			System.out.println("Contact deleted!");
		} else
			System.out.println("No Contact found by this id");
	}

	private static void mainUpdateContact(int id,
			ListFileRepository fileRepository) {
		Contact updateContact = new Contact(12, "Abcd", "Wxyz", "Andheri",
				9823166777L, "abc07@gmail.com");

		if (fileRepository.updateById(id, updateContact)) {
			System.out.println("Contact updated!");
		} else
			System.out.println("No Contact found by this id");
	}

	private static void mainSearchContact(int id,
			ListFileRepository fileRepository, Menu menu) {
		Contact searchedContact = fileRepository.searchById(id);

		if (searchedContact != null) {
			menu.displayContact(fileRepository.viewContact(searchedContact));
		} else
			System.out.println("No Contact found by this id");

	}

	private static void mainAdd(ListFileRepository fileRepository) {
		Contact newContact = new Contact(12, "Abcd", "Wxyz", "Andheri",
				9823166777L, "abc@gmail.com");

		fileRepository.add(newContact);

	}

	private static void mainViewAllContact(ListFileRepository fileRepository,
			Menu menu) {

		menu.displayAll(fileRepository.viewAllContact());
		System.out.println();

	}

}
