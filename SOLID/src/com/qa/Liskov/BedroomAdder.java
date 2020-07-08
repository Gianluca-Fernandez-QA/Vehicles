package com.qa.Liskov;

public class BedroomAdder {

	public static void addBedroom(Object test, int bed) {
		test.setNumberOfBedrooms(13 + bed);
	}
}
