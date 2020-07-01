package com.qa.vehicle;

public class Bus extends Vehicle {
private boolean hasChildren;

public Bus(int wheelsNo, String coatColour, int passengersCap, int maxSpeed, boolean hasChildren) {
	
	this.hasChildren = true;
	this.setVehicle_Type("Bus");
}
	public Bus() {
		this.hasChildren = true;
		this.setVehicle_Type("Bus");
		
	}
	public boolean isHasChildren() {
		return hasChildren;
	}
	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
	
	

}
