package com.boushib.solid;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		AreaCalc areaCalc = new AreaCalc();
		AreaLog areaLog = new AreaLog(areaCalc);
		Circle circle = new Circle(10);
		Square square = new Square(10);
		Rectangle rectangle = new Rectangle(10, 10);
		List<Shape> shapes = List.of(circle, square, rectangle);
		System.out.println(areaLog.json(shapes));
		System.out.println(areaLog.csv(shapes));
	}
}
