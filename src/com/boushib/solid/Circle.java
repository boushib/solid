package com.boushib.solid;

public class Circle implements Shape {
	private final double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	public double area(){
		return Math.PI * Math.pow(radius, 2);
	}
}
