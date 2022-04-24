package com.boushib.solid;
public class Square implements Shape {
	private final double width;

	public Square(double width){
		this.width = width;
	}

	public double area(){
		return Math.pow(width, 2);
	}
}
