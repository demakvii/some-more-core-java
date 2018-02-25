package com.techlabs.junit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.techlabs.junit.Operation;

public class OperationTests {

	@Test
	public void testAdd() {
		// Arrange

		Operation operation = new Operation();
		int expectedResult = 7;

		// Act

		int actualResult = operation.add(3, 4);

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testSub() {
		// Arrange

		Operation operation = new Operation();
		int expectedResult = -1;

		// Act

		int actualResult = operation.sub(3, 4);

		// Assert

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testDivide() {
		// Arrange

		Operation operation = new Operation();
		int expectedResult = 5;

		// Act

		int actualResult = operation.divide(10, 2);

		// Assert

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testMultiply() {
		// Arrange

		Operation operation = new Operation();
		int expectedResult = 24;

		// Act

		int actualResult = operation.multiply(6, 4);

		// Assert

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCustomDivide() {

		Operation operation = new Operation();

		try {
			operation.customDivide(10, 10);

			fail("Expected Exception");
			

		} catch (Exception e) {

		}

	}

}
