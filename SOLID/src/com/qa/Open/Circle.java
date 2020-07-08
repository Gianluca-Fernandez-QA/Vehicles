package com.qa.Open;

public class Circle implements Shape {
	private static double radius;

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		Circle.radius = radius;
	}
}