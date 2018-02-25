package com.techlabs.interfaceex.test;

import com.techlabs.interfaceex.InterfaceTwo;

public class InterfaceTest implements InterfaceTwo {

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
