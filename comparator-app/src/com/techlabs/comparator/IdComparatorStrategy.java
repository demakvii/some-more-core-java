package com.techlabs.comparator;

import java.util.Comparator;

public class IdComparatorStrategy implements Comparator<LineItem> {

	@Override
	public int compare(LineItem o1, LineItem o2) {
		if (o1.getId() > o2.getId())
			return 1;
		if (o1.getId() < o2.getId())
			return -1;
		return 0;
	}

}
