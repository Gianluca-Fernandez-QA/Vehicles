package com.qa.vehicle;

public class Car extends Vehicle {
private boolean spoiler;

public Car(int wheelsNo, String coatColour, int passengersCap, int maxSpeed, boolean hasChildren) {
	
	this.setVehicle_Type("Car");
	this.spoiler = true;
}
	public Car() {
		
	}
	public boolean isSpoiler() {
		return spoiler;
	}
	public void setSpoiler(boolean spoiler) {
		this.spoiler = spoiler;
	}
	
	
	

}