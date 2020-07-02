package com.qa.input;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Person {
	

public static Object userInput() {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = scan.nextLine();
	System.out.println("What is your Job Title?");
	String job_Title = scan.nextLine();
	System.out.println("How old are you?");
	int age = scan.nextInt();

	return employee_const(name, age, job_Title);
}

public static String employee_const(String Name, int age, String job_Title) {

	String temp_builder = ("Name: "+Name+" Age: "+age+" Job title: "+job_Title);
	System.out.println(temp_builder);
	return "";
}



}