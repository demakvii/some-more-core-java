package com.techlabs.unique.lineitem.refactor.test;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.unique.lineitem.refactor.*;;

public class TestLineItem {

	public static void main(String[] args) {
		Set<LineItem> items;
		items = new HashSet<LineItem>();
		items.add(new LineItem(5, "Football", 5, 800));
		items.add(new LineItem(5, "Football", 5, 800));
		items.add(new LineItem(2, "Cricket ball", 10, 150));
		items.add(new LineItem(15, "Volley ball", 2, 400));
		items.add(new LineItem(500, "Basket ball", 3, 600));
		display(items);
	}

	private static void display(Set<LineItem> items) {
		for (LineItem lineItem : items) {
			System.out.println(lineItem);
		}
	}

}
