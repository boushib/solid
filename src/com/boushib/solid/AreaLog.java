package com.boushib.solid;

import java.util.List;

public class AreaLog {
	private final IAreaCalc areaCalc;

	public AreaLog(IAreaCalc areaCalc){
		this.areaCalc = areaCalc;
	}

	public String json(List<Shape> shapes){
		return "{ sum : %s }".formatted(areaCalc.sum(shapes));
	}

	public String csv(List<Shape> shapes){
		return "sum,%s".formatted(areaCalc.sum(shapes));
	}
}
