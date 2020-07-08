package com.qa.Liskov;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Penthouse asf = new Penthouse();
		System.out.println(asf.getNumberOfBedrooms());
		BedroomAdder.addBedroom(asf, Integer.parseInt(myObj.nextLine()));
		;
		System.out.println(asf.getNumberOfBedrooms());
	}

}
