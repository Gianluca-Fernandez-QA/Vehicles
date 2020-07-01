package com.qa.vehicle;

import java.util.ArrayList;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus(6, "Red", 16, 80, true);
		Motorbike Bikey = new Motorbike();
		Bikey.setCoatColour("Black");
		Car Sally = new Car();
		ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
		Garage.add(bus);
		Garage.add(Bikey);
		Garage.add(Sally);
		
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


