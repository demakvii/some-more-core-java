package com.techlabs.contact.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.contact.Contact;
import com.techlabs.contact.core.DataFileBin;
import com.techlabs.contact.core.ListFileRepository;

public class ListFileRepositoryTests {

	@Test
	public void testFind() {
		// Arrange
		ListFileRepository fileRepository = new ListFileRepository(
				new DataFileBin());
		int expectedResult = -1;

		// Act

		int actualResult = fileRepository.find(20);

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testUpdateById() {
		// Arrange
		ListFileRepository fileRepository = new ListFileRepository(
				new DataFileBin());
		Boolean expectedResult = true;
		Contact updateContact = new Contact(10, "Mayur", "Kalekar", "Panvel",
				7754848839L, "mayur.kalekar007@gmail.com");
		// Act

		Boolean actualResult = fileRepository.updateById(10, updateContact);

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testSearchById() {
		// Arrange
		ListFileRepository fileRepository = new ListFileRepository(
				new DataFileBin());
		Boolean expectedResult = true;
		// Act
		Boolean actualResult = false;
		if (fileRepository.searchById(10) != null)
			actualResult = true;

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testDeleteById() {
		// Arrange
		ListFileRepository fileRepository = new ListFileRepository(
				new DataFileBin());
		Boolean expectedResult = true;
		// Act
		Boolean actualResult = fileRepository.deleteById(10);

		// Assert

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void testCommit() {
		// Arrange
		ListFileRepository fileRepository = new ListFileRepository(
				new DataFileBin());
		Boolean expectedResult = true;
		// Act
		Boolean actualResult = fileRepository.commit();

		// Assert

		assertEquals(expectedResult, actualResult);

	}

}
