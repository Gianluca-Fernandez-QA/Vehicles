package com.qa.calTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.cal.Ghast;
import com.qa.cal.calculator;

public class RunnerTest {

	@Test
	public void minus() {
		calculator test = new calculator();
		assertEquals(25.0, calculator.calcuMath(Ghast.MINUS, 10.0, 15.0), 0.01f);
		assertEquals(670.0, calculator.calcuMath(Ghast.MINUS, 680, 10), 0.01f);
		assertEquals(25.0, calculator.calcuMath(Ghast.MINUS, 10.0, 15.0), 0.01f);
	}

	@Test
	public void add() {
		calculator test = new calculator();
		assertEquals(25.0, calculator.calcuMath(Ghast.ADD, 10.0, 15.0), 0.01f);
	}
}
