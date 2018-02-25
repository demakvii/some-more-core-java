package com.techlabs.collection.test;

import com.techlabs.collection.Items;
import com.techlabs.collection.LineItem;

public class LineItemTest {

	public static void main(String[] args) {

		Items items = new Items();

		// add
		System.out.println("---Adding item in items---");
		items.addItem(new LineItem(1, "Football", 3, 1000));
		items.addItem(new LineItem(2, "Cricket Ball", 1, 800));
		items.addItem(new LineItem(3, "Volley ball", 3, 400));
		items.addItem(new LineItem(4, "Hand Ball", 4, 300));
		System.out.println(items);

		System.out.println("\n---Finding Cricket ball in items---");
		// find
		System.out.println("Cricket ball at position:"
				+ items.findItemByName("Cricket Ball"));

		System.out.println("\n---Sorting items by name---");
		// sort
		items.sortByName();
		System.out.println(items);

		System.out.println("\n---Deleteing Volley ball from items---");
		// delete
		items.deleteItemByName("Volley ball");
		System.out.println(items);

	}
}
