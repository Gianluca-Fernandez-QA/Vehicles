package com.qa.vehicle;

import java.util.ArrayList;

public class Garage {
	private static ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
	
	public static void RemoveArrayItem(Object remov) {
	     Garage.remove(remov);		
		}
	
	public void dArrayItem(Vehicle test) {
		Garage.add(test);
	}
	
	public static void CalculateBill() {
	for(int i = 0; i < Garage.size(); i++) {
		
		switch(Garage.get(i).getWheelsNo()) {
		case 2:
			System.out.println("You owe £6.98");
		break;
		case 4:
			System.out.println("You owe £8.90");
		break;
		case 6:
			System.out.println("You owe £18.32");
		break;
		default:
			System.out.println("You owe £12.00");
		break;
		}
	}
		}
}
