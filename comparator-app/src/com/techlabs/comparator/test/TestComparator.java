package com.techlabs.comparator.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.comparator.IdComparatorStrategy;
import com.techlabs.comparator.LineItem;
import com.techlabs.comparator.NameComparatorStrategy;
import com.techlabs.comparator.QtyComparatorStrategy;

public class TestComparator {

	public static void main(String[] args) {
		List<LineItem> items;
		items = new ArrayList<LineItem>();
		items.add(new LineItem(5, "Football", 5, 800));
		items.add(new LineItem(2, "Cricket ball", 10, 150));
		items.add(new LineItem(15, "Volley ball", 2, 400));
		items.add(new LineItem(500, "Basket ball", 3, 600));
		System.out.println("---Sort By Name---");
		sortByName(items);
		System.out.println("---Sort By Id---");
		sortById(items);
		System.out.println("---Sort By Qty---");
		sortByQty(items);

	}

	private static void sortByQty(List<LineItem> items) {
		items.sort(new QtyComparatorStrategy());
		display(items);
	}

	private static void sortById(List<LineItem> items) {
		items.sort(new IdComparatorStrategy());
		display(items);
	}

	private static void sortByName(List<LineItem> items) {
		items.sort(new NameComparatorStrategy());
		display(items);
	}

	private static void display(List<LineItem> items) {
		for (LineItem lineItem : items) {
			System.out.println(lineItem);
		}
	}
}
