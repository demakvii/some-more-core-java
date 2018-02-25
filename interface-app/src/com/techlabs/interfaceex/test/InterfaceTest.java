package com.techlabs.interfaceex.test;

import com.techlabs.interfaceex.InterfaceOne;

public class InterfaceTest implements InterfaceOne {

	public static void main(String[] args) {
		InterfaceTest interfaceTest = new InterfaceTest();
		interfaceTest.methodOne();
		interfaceTest.methodTwo();
	}

	@Override
	public void methodOne() {
		System.out.println("This is method one");
	}

	@Override
	public void methodTwo() {
		System.out.println("This is method two");
	}

}
