package com.techlabs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Items {
	private ArrayList<LineItem> order;

	public Items() {
		order = new ArrayList<LineItem>();
	}

	public void addItem(LineItem item) {
		this.order.add(item);
	}

	public int findItemByName(String itemName) {
		int c = 0;
		for (LineItem item : order) {

			if (item.getName().equalsIgnoreCase(itemName))
				return c+1;
			c++;
		}
		return -1;
	}

	public void deleteItemByName(String itemName) {
		if ((findItemByName(itemName)-1) >= 0)
			order.remove(findItemByName(itemName)-1);
	}

	public void sortByName() {
		Collections.sort(order, new Comparator<LineItem>() {

			@Override
			public int compare(LineItem o1, LineItem o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});
	}

	@Override
	public String toString() {
		return order + "";
	}
}
