package com.techlabs.test;

public class SubStringTest {
	
	public static void main(String [] arguments) {
		
		System.out.println("Phone numbers with country code:");
		
		printFooter();
		
		for (String number : arguments) {
			System.out.println(number);
		}
		
		printFooter();
		
		System.out.println("Phone number without country code using substring method:");
		
		printFooter();
		
		for (String number : arguments) {
			System.out.println(number.substring(3));
		}
		
		printFooter();
	}
	
	public static void printFooter(){
		
		System.out.println("---------------------");
	}

}
