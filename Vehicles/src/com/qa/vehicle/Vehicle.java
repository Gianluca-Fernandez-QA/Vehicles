package com.qa.vehicle;

public class Vehicle{
private int wheelsNo;
private String coatColour;
private int passengersCap;
private int maxSpeed;
private String Vehicle_Type;
public Vehicle(int wheelsNo, String coatColour, int passengersCap, int maxSpeed, String Vehicle_Type) {
	this.wheelsNo = wheelsNo;
	this.coatColour = coatColour;
	this.passengersCap = passengersCap;
	this.maxSpeed = maxSpeed;
	this.Vehicle_Type = "";
}
public Vehicle() {
	
}
public int getWheelsNo() {
	return wheelsNo;
}
public void setWheelsNo(int wheelsNo) {
	this.wheelsNo = wheelsNo;
}
public String getCoatColour() {
	return coatColour;
}
public void setCoatColour(String coatColour) {
	this.coatColour = coatColour;
}
public int getPassengersCap() {
	return passengersCap;
}
public void setPassengersCap(int passengersCap) {
	this.passengersCap = passengersCap;
}
public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public String getVehicle_Type() {
	return Vehicle_Type;
}
public void setVehicle_Type(String vehicle_Type) {
	Vehicle_Type = vehicle_Type;
}


}