package com.techlabs.comparator;

import java.util.Comparator;

public class QtyComparatorStrategy implements Comparator<LineItem> {

	@Override
	public int compare(LineItem o1, LineItem o2) {
		if (o1.getQuantity() > o2.getQuantity())
			return 1;
		if (o1.getQuantity() < o2.getQuantity())
			return -1;
		return 0;
	}

}
