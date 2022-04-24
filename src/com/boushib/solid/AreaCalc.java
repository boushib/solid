package com.boushib.solid;

import java.util.List;

public class AreaCalc implements IAreaCalc {
	@Override
	public double sum(List<Shape> shapes){
		int sum = 0;

		for (Shape shape : shapes) {
			sum += shape.area();
		}

		return sum;
	}
}
