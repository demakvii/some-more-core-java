package com.techlabs.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int array[] = new int[5];

		try {
			array[6] = 0;
			System.out.println("Accessing 6th element  :" + array[6]);

		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
		}

	}

}
