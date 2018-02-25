package com.techlabs.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.junit.Maximum;

public class TestLogic {

	@Test
	public void testFindMax() {

		// Arrange

		int[] numbers = { 1, 3, 4, 2 };
		int expectedResult = 4;

		// Act

		int actualResult = Maximum.findMax(numbers);

		// Assert

		assertEquals(expectedResult, actualResult);
	}
}