package com.qa.Goldilocks;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computation test = new Computation();
		Porridge a1 = new Porridge();
		Chair a2 = new Chair();
		test.setChairStrength(40);
		test.setPorridgeHeat(50);
		System.out.println(test.Check(a1, a2));
	}

}
