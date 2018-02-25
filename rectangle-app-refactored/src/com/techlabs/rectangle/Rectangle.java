package com.techlabs.rectangle;


public class Rectangle {
		private int width;
		private int height;
		private ColorType color;
		
		public void fillColor(ColorType pcolor){

			color =pcolor;
		}
		
		public void setWidth(int pwidth){
			
			if(pwidth<0){
				width = 0;
			}
			else
				width=pwidth;
				
		}
		
		public void setHeight(int pheight) {
			
			if(pheight<0){
				height = 0;
			}
			else
				height=pheight;
							
		}
		
		public int calcArea() {
			
			return (height*width);
		
		}
		
		public int calcPerimeter() {
			
			return (2*(height+width));
		
		}
		
		public ColorType getColor() {
			
			return color;
		}
		
		public int getWidth() {
			return width;
			
		}
		
		public int getHeight() {
			return height;
			
		}

}


