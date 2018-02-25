package com.techlabs.test;

public class TestStringArray {
	
	public static void main(String [] argStrings) {
		
		testStringArrayMutation();
		
	}

	private static void testStringArrayMutation() {
		
		String [] stringList = {"Hello",
								 "World",
								 "Java"
								};
		mutateStringArray(stringList);
		
		System.out.println("String List after Mutation:");
		for (String string : stringList) {
			System.out.println(string);
		}
		
	}

	private static void mutateStringArray(String[] stringList) {
		
		for (int index = 0; index < stringList.length; index++) {
			stringList[index]="Hello";
		}
		
	}

}
