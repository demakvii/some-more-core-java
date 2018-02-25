package com.techlabs.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		
		//Boxing
		int number = 100;
		Integer boxNumber = new Integer(number);
		System.out.println(boxNumber);
		
		//UnBoxing
		Integer newBoxNumber = new Integer(100);
		int newNumber = newBoxNumber;
		System.out.println(newNumber);
	}

}
