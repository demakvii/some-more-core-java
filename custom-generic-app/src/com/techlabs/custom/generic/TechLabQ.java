package com.techlabs.custom.generic;

import java.util.Iterator;
import java.util.LinkedList;

public class TechLabQ<T> implements Iterable<T> {
	private LinkedList<T> linkedList;

	public TechLabQ() {
		linkedList = new LinkedList<T>();
	}

	public void enqueue(T item) {
		linkedList.addLast(item);
	}

	public void dequeue() {
		linkedList.removeFirst();
	}

	@Override
	public Iterator<T> iterator() {
		return linkedList.iterator();
	}
}
