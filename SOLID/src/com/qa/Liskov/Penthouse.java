package com.qa.Liskov;

public class Penthouse {
	private static int squareFootage;
	private static int numberOfBedrooms;

	public Penthouse() {
		this.setNumberOfBedrooms(4);
	}

	public static int getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(int sqft) {
		Penthouse.squareFootage = sqft;
	}

	public static int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		Penthouse.numberOfBedrooms = numberOfBedrooms;
	}
}
