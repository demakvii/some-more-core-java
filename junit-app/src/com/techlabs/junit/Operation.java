package com.techlabs.junit;

public class Operation {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	
	public void customDivide(int a,int b) throws Exception{
		if(b==0)
			throw new Exception();
		else
			System.out.println(a/b);
	}

}
