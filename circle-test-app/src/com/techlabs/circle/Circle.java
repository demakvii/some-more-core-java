package com.techlabs.circle;

 
public class Circle {
	
	private float radius;
	private ColorType color =ColorType.BLUE;
	
	public void fillColor(ColorType pcolor){
		color = pcolor;
	}
	
	public void setRadius(float pradius){
		
		if(pradius<0)
			radius=0;
		else
			radius =pradius;
	}
	
	public float calcArea(){
		return (3.14f*radius*radius);
	}
	
	public float calcPerimeter(){
		return (2*3.14f*radius);
	}
	
	public ColorType getColor() {
		return color;
		
	}
	
	public float getRadius(){
		return radius;
	}

}
