package com.qa.Goldilocks;

public class Porridge implements GoldilockInterface {

	@Override
	public boolean Check(int test) {
		if (test <= 100) {
			return true;
		} else
			return false;
	}
}
