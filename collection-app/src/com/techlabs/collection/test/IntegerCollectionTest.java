package com.techlabs.collection.test;

import com.techlabs.collection.IntegerCollection;

public class IntegerCollectionTest {

	public static void main(String[] args) {
		IntegerCollection collection = new IntegerCollection();

		// Add
		System.out.println("---Adding an integer into IntegerList---");
		collection.add(30);
		collection.add(10);
		collection.add(20);
		collection.add(40);
		System.out.println(collection);

		// sort
		System.out.println("\n---Sorting IntegerList---");
		collection.sort();
		System.out.println(collection);

		// find
		System.out.println("\n---Finding an integer in IntegerList---");
		System.out.println("30 is at position:" + collection.find(30));

		// Delete
		System.out.println("\n---Deleting an integer from IntegerList---");
		collection.delete(20);
		System.out.println(collection);

		// Update
		System.out.println("\n---Updating IntegerList---");
		collection.update(2, 300);

		collection.sort();
		System.out.println(collection);

	}

}
