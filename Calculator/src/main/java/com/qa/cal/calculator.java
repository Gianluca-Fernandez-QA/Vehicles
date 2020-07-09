package com.qa.cal;

public class calculator {

	public static double calcuMath(Ghast operation, double firstNum, double secondNum) {

		switch (operation) {
		case ADD:
			return firstNum + secondNum;

		case MINUS:
			return firstNum - secondNum;

		case DIVIDE:
			return firstNum / secondNum;

		case TIMES:
			return firstNum * secondNum;

		default:
			System.out.println("Enter a conditional");
			break;

		}
		return secondNum;

	}

}
