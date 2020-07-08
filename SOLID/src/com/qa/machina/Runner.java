package com.qa.machina;

public class Runner {
	public static void main(String[] args) {
		Car Luca = new Car("Red", "Rover", 500);
		System.out.println(Luca.getColour());
		Driver.drive(500);
		System.out.println(Driver.getMileage());
	}
}
