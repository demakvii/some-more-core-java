package com.techlabs.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TestDateTime {

	public static void main(String[] args) {
		int day, month, year;
		
		Scanner scanner;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Current Date and Time is:");

		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));

		scanner = new Scanner(System.in);
		System.out.println("Enter your Birth date");
		System.out.println("Enter Day:");
		day = scanner.nextInt();
		System.out.println("Enter month:");
		month = scanner.nextInt();
		System.out.println("Enter year:");
		year = scanner.nextInt();

		calculateAge(day, month, year);
		
		int afterDay = 5;
		dateAfterTime(afterDay);
		
		scanner.close();

	}

	private static void dateAfterTime(int afterDay) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Calendar currentDate = Calendar.getInstance();
		currentDate.set(Calendar.DATE, currentDate.get(Calendar.DATE)
				+ afterDay);
		System.out.println("After " + afterDay + " days date will be:");
		System.out.println(dateFormat.format(currentDate.getTime()));
	}

	private static void calculateAge(int day, int month, int year) {
		Calendar currentDate = Calendar.getInstance();
		int currDay, currMonth, currYear;
		currDay = currentDate.get(Calendar.DAY_OF_MONTH);
		currMonth = currentDate.get(Calendar.MONTH) + 1;
		currYear = currentDate.get(Calendar.YEAR) - 1;

		System.out.println("You are " + (Math.abs(year - currYear)) + " Years "
				+ (Math.abs(month - currMonth)) + " Months "
				+ (Math.abs(day - currDay)) + " Days");

	}

}
