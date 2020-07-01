package com.qa.vehicle;

import java.util.ArrayList;


public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus(6, "Red", 16, 80, true, "Bus");
		Motorbike Bikey = new Motorbike();
		Bikey.setCoatColour("Black");
		Car Sally = new Car();
		
		Garage.CalculateBill();
		
		
		
		}
	
	
	
}


