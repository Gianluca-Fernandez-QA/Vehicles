package com.qa.Goldilocks;

public class Computation {
	private int porridgeHeat;

	public void setPorridgeHeat(int porridgeHeat) {
		this.porridgeHeat = porridgeHeat;
	}

	public void setChairStrength(int chairStrength) {
		this.chairStrength = chairStrength;
	}

	private int chairStrength;

	public boolean Check(Porridge test, Chair test2) {
		if (test.Check(porridgeHeat) == true && test2.Check(chairStrength) == true) {
			return true;
		} else {
			return false;
		}
	}

}
