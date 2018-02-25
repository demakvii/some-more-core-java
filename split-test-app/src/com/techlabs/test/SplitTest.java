package com.techlabs.test;

public class SplitTest {
	
	public static void main(String [] arguments) {
		
		String text = "Welcome-to-java-world";
		
		System.out.println("String before using Split method:");
		
		System.out.println(text);

		printFooter();
		
		System.out.println("String after using Split method:");
		
		for (String word : text.split("-")) {
			
			System.out.println(word);
			
		}
		
		printFooter();
		
	}
	
	public static void printFooter(){
		
		System.out.println("---------------------");
	}

}
