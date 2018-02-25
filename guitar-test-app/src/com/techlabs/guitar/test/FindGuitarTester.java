package com.techlabs.guitar.test;

import java.util.Iterator;
import java.util.List;
import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;
import com.techlabs.guitar.Inventory;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC,6, Wood.ALDER, Wood.ALDER);
		List matchingGuitar = inventory.search(whatErinLikes);
		
		if (!matchingGuitar.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			
			for (Iterator iterator = matchingGuitar.iterator(); iterator
					.hasNext();) {
				Guitar guitar = (Guitar) iterator.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println(" We have a " + spec.getBuilder() + " "
						+ spec.getModel() + " "+spec.getNumStrings()+"-string "+ spec.getType()
						+ " guitar:\n    " + spec.getBackWood()
						+ " back and sides,\n    " + spec.getTopWood()
						+ " top.\n You can have it for only "
						+ guitar.getPrice() + "!\n ----");

			}
		} else
			System.out.println("Sorry, Erin , we have nothing for you.");

	}

	private static void initializeInventory(Inventory inventory) {
		GuitarSpec specOne = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC,6, Wood.ALDER, Wood.ALDER);
		GuitarSpec specTwo = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("1", 10,specOne);
		inventory.addGuitar("100", 500, specTwo);
	}

}
