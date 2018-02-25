package com.techlabs.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;

	public Inventory() {

		guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator iterator = guitars.iterator(); iterator.hasNext();) {
			Guitar guitar = (Guitar) iterator.next();
			if (guitar.getSerialNumber().equals(serialNumber))
				return guitar;
		}
		return null;
	}

	public List search(GuitarSpec searchSpec) {
		List matchingGuitars = new LinkedList();
		for (Iterator iterator = guitars.iterator(); iterator.hasNext();) {
			Guitar guitar = (Guitar) iterator.next();
			if (guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);

		}
		return matchingGuitars;
	}

}
