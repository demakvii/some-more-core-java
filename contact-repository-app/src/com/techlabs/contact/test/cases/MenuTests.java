package com.techlabs.contact.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.contact.menu.Menu;
import com.techlabs.contact.menu.NumericListStyle;

public class MenuTests {

	@Test
	public void testCheckOption() {
		// Arrange
		NumericListStyle style = new NumericListStyle();
		Menu menu = new Menu(style);
		int expectedResult = 3;

		// Act

		int actualResult = menu.checkOption(3);

		// Assert

		assertEquals(expectedResult, actualResult);

	}
}
