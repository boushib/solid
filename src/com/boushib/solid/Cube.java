package com.boushib.solid;

public class Cube implements ThreeDimensionalShape {
	double sideLength;

	public Cube(double sideLength){
		this.sideLength = sideLength;
	}

	public double area() {
		return 6 * Math.pow(sideLength, 2);
	}

	public double volume() {
		return Math.pow(sideLength, 3);
	}
}
