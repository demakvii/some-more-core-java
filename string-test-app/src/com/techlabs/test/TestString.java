package com.techlabs.test;

public class TestString {
	
	public static void  main(String [] arStrings) {
		
		testStringMutation();
		
	}

	private static void testStringMutation() {
		
		String string ="Hello World";
		mutateString(string);
		System.out.println("String after mutation is "+string);
		
	}

	private static void mutateString(String string) {
		
		string="Hello Java";
		
	}

}
