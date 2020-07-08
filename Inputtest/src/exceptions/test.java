package exceptions;

public class test {

	public static float test(float a, float b) {
		try {

			a = a / b;
			throw new customError("Testing");
		} catch (customError e) {
			e.printStackTrace();
		} finally {
			return a;
		}

	}

}
