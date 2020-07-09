package com.qa.Goldilocks;

public class Chair implements GoldilockInterface {

	@Override
	public boolean Check(int test) {
		// TODO Auto-generated method stub
		if (test <= 80) {
			return true;
		} else
			return false;
	}

}
