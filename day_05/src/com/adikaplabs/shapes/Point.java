package com.adikaplabs.shapes;

public class Point {
	
	private double x, y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
