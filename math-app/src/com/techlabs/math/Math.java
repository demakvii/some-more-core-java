package com.techlabs.math;

public class Math {

	public static void add(int numberOne, int numberTwo) {

		if (numberOne < 0 || numberTwo < 0)
			throw new RuntimeException("One number is negative");
		else
			System.out.println("Result is:" + (numberOne + numberTwo));
	}

	public static void divide(int numberOne, int numberTwo) throws Exception {
		if (numberTwo == 0)
			throw new Exception("Can't divide a number with zero");
		else
			System.out.println("Result is:" + 0.1f * numberOne / numberTwo);
	}
}
