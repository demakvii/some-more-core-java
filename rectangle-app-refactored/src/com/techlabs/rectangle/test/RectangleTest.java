package com.techlabs.rectangle.test;

import com.techlabs.rectangle.*;
public class RectangleTest {
	
	public static void main(String [] aStrings) {

		shouldFillColorTest();
		shouldSetWidthTest();
		shouldSetHeightTest();
		shouldCalcAreaTest();
		shouldCalcPerimeterTest();

	}

	private static void shouldCalcPerimeterTest() {
		
		Rectangle rect;
		rect = new Rectangle();
		int expectedPerimeter = 20;
		
		rect.setHeight(10);
		rect.setWidth(30);
		
		int actualPerimeter = rect.calcPerimeter();
		
		if(actualPerimeter==expectedPerimeter)
			System.out.println("shouldCalcPerimeter Test passed");
		else
			System.out.println("shouldCalcPerimeter Test failed");
		
	}

	private static void shouldCalcAreaTest() {
		
		Rectangle rect;
		rect = new Rectangle();
		int expectedArea = 400;
		
		rect.setHeight(10);
		rect.setWidth(30);
		
		int actualArea = rect.calcArea();
		
		if(actualArea==expectedArea)
			System.out.println("shouldCalcArea Test passed");
		else
			System.out.println("shouldCalcArea Test failed");
		
	}

	private static void shouldSetHeightTest() {
				
		Rectangle rect;
		rect = new Rectangle();
		int expectedHeight = 10;
				
		rect.setHeight(10);
		int actualHeight = rect.getHeight();
			
		if(expectedHeight==actualHeight)
			System.out.println("shouldSetHeight Test passed");
		else 
			System.out.println("shouldSetHeight Test Failed");
		
	}

	private static void shouldSetWidthTest() {
		
		Rectangle rect;
		rect = new Rectangle();
		int expectedWidth = 10;
				
		rect.setWidth(10);
		int actualWidth = rect.getWidth();
				
		if(expectedWidth==actualWidth)
			System.out.println("shouldSetWidthTest passed");
		else 
			System.out.println("shouldSetWidthTest Failed");
		
	}

	private static void shouldFillColorTest() {
		
		Rectangle rect; 
		rect = new Rectangle(); 
		ColorType expectedColor = ColorType.GREEN;
		
		rect.fillColor(ColorType.GREEN);
		ColorType actualColor =rect.getColor();

		if(actualColor==expectedColor)
			System.out.println("shouldFillColorTest Passed");
		else 
			System.out.println("shouldFillColorTest Failed");

	}

}
