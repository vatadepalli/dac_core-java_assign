package com.adikaplabs.shapes;

public class Circle extends Point implements Computable{

	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return PI * radius * radius;
	}
	
	@Override
	public double calcPerimeter() {
		return 2 * PI * radius;
	}
	

	public void drawArc() {
		System.out.println("Drawing Arc");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\n";
	}

}
