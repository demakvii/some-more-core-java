package com.techlabs.student.test;

import com.techlabs.student.StudentUtils;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println("Sorted by Name\n----------");
		sortByNameTest();
		System.out.println("Sorted by Location\n----------");
		sortByLocationTest();
	}

	private static void sortByLocationTest() {
		StudentUtils studentUtils = new StudentUtils(
				"E:/workspacePracs/student-csv-app/student.csv");
		studentUtils.sortByLocation();
	}

	private static void sortByNameTest() {
		StudentUtils studentUtils = new StudentUtils(
				"E:/workspacePracs/student-csv-app/student.csv");
		studentUtils.sortByName();
	}

}
