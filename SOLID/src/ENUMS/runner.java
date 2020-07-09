package ENUMS;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double earthWeight = Double.parseDouble("20");
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values()) {
			System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
		}

	}
}
