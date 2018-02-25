package com.techlabs.annotation;

@NeedRefactor("true")
public class Foo {

	private int fieldOne;
	private int fieldTwo;

	public Foo() {
		System.out.println("This is a constructor");
	}

	@NeedRefactor("false")
	public void methodOne() {
		System.out.println("This is a methodOne");
	}

	public void methodTwo() {
		System.out.println("This is a methodTwo");
	}

	public void methodThree() {
		System.out.println("This is a methodThree");
	}

	@NeedRefactor("true")
	public void methodFour() {
		System.out.println("This is a methodFour");
	}

	public int getFieldOne() {
		return fieldOne;
	}

	public int getFieldTwo() {
		return fieldTwo;
	}

}
