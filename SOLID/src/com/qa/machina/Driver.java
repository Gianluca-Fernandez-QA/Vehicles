package com.qa.machina;

public class Driver {
	private static int mileage;

	// functionality
	public static void drive(int milesDriven) {
		Driver.setMileage(milesDriven + Car.getMileage());
	}

	private void setMileage(String string) {
		// TODO Auto-generated method stub

	}

	public static int getMileage() {
		return mileage;
	}

	public static void setMileage(int mileage) {
		Driver.mileage = mileage;
	}

}
