package com.techlabs.collection;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerCollection {
	private ArrayList<Integer> integerList;

	public IntegerCollection() {
		this.integerList = new ArrayList<Integer>();
	}

	public void add(int integer) {
		this.integerList.add(integer);
	}

	public int find(int integer) {
		for (int index = 0; index < integerList.size(); index++) {
			if (integerList.get(index) == integer)
				return (index+1);
		}
		return -1;
	}

	public void delete(int integer) {
		if (find(integer) -1> 0)
			this.integerList.remove(find(integer) - 1);
	}

	public void update(int position, int integer) {
		if (position-1 >= 0 && position-1 <= integerList.size())
			this.integerList.set(position-1, integer);
	}

	public void sort() {
		Collections.sort(integerList);
	}

	@Override
	public String toString() {
		return integerList + "";
	}
}
