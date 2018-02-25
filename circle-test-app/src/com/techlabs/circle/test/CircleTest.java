package com.techlabs.circle.test;

import com.techlabs.circle.Circle;
import com.techlabs.circle.ColorType;

public class CircleTest {
	
	public static void main(String [] argsStrings) {
		
		shouldFillColorTest();
		shouldSetRadiusTest();
		shouldCalcAreaTest();
		shouldCalcPerimeterTest();
	}

	private static void shouldCalcPerimeterTest() {
		
		Circle circle;
		circle= new Circle();
		float expectedPerimeter = 2*3.14f*10;
		
		circle.setRadius(10);
		
		float actualPerimeter = circle.calcPerimeter();
		
		if(actualPerimeter==expectedPerimeter)
			System.out.println("shouldCalcPerimeterTest passed");
		else
			System.out.println("shouldCalcPerimeterTest failed");
		
	}

	private static void shouldCalcAreaTest() {
		
		Circle circle;
		circle= new Circle();
		float expectedArea = 3.14f*15*15;
		
		circle.setRadius(15);
		
		float actualArea = circle.calcArea();
		
		if(actualArea==expectedArea)
			System.out.println("shouldCalcAreaTest passed");
		else
			System.out.println("shouldCalcAreaTest failed");
		
		
	}

	private static void shouldSetRadiusTest() {
		
		Circle circle;
		circle = new Circle();
		float expectedRadius = 1;
		
		circle.setRadius(5.5f);
		
		float actualRadius = circle.getRadius();
		
		if(actualRadius==expectedRadius)
			System.out.println("shouldSetRadiusTest passed");
		else
			System.out.println("shouldSetRadiusTest failed");
			
	}

	private static void shouldFillColorTest() {
		
		Circle circle;
		circle = new Circle();
		ColorType expectedColor = ColorType.BLUE;
		
		
		ColorType actualColor = circle.getColor();
		System.out.println(actualColor);
		if(expectedColor==actualColor)
			System.out.println("shouldFillColorTest passed");
		else
			System.out.println("shouldFillColorTest failed");
			
	}

}
