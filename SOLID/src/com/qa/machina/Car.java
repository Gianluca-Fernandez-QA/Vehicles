package com.qa.machina;

public class Car {
	private String colour;
	private String model;
	private static int mileage;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static int getMileage() {
		return mileage;
	}

	public static void setMileage(int mileage) {
		Car.mileage = mileage;
	}

	// constructor
	public Car(String colour, String model, int mileage) {
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
	}
}
