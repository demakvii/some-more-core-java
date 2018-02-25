package com.techlabs.math.test;

import com.techlabs.math.Math;

public class MathTest {

	public static void main(String[] args) {

		try {
			Math.add(3, -2);
		} catch (RuntimeException rte) {
			System.out.println(rte);
		}

		try {
			Math.divide(1, 0); // checked:Compiler requires that you to handle
								// the exception
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
