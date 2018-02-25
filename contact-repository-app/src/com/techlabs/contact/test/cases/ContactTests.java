package com.techlabs.contact.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.contact.Contact;

public class ContactTests {
	@Test
	public void testGetId() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		int expectedResult = 10;

		// Act

		int actualResult = contact.getId();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testGetFirstName() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		String expectedResult = "Mayur";

		// Act

		String actualResult = contact.getFirstName();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testGetLastName() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		String expectedResult = "Kalekar";

		// Act

		String actualResult = contact.getLastName();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testGetLocation() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		String expectedResult = "Panvel";

		// Act

		String actualResult = contact.getLocation();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testGetPhoneNumber() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		long expectedResult = 9823166879L;

		// Act

		long actualResult = contact.getPhoneNumber();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testGetEmailId() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		String expectedResult = "mayur.kalekar007@gmail.com";

		// Act

		String actualResult = contact.getEmailId();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testSetId() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		int expectedResult = 10;

		// Act
		contact.setId(expectedResult);
		int actualResult = contact.getId();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testSetFirstName() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		String expectedResult = "Mayur";

		// Act
		contact.setFirstName(expectedResult);
		String actualResult = contact.getFirstName();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testSetLastName() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		String expectedResult = "Kalekar";

		// Act
		contact.setLastName(expectedResult);
		String actualResult = contact.getLastName();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testSetLocation() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		String expectedResult = "Panvel";

		// Act
		contact.setLocation(expectedResult);
		String actualResult = contact.getLocation();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testSetPhoneNumber() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		long expectedResult = 9823166879L;

		// Act
		contact.setPhoneNumber(expectedResult);
		long actualResult = contact.getPhoneNumber();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testSetEmailId() {
		// Arrange

		Contact contact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				9823166879L, "mayur.kalekar007@gmail.com");
		String expectedResult = "mayur.kalekar007@gmail.com";

		// Act
		contact.setEmailId(expectedResult);
		String actualResult = contact.getEmailId();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

}
