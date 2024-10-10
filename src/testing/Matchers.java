package testing;
import jrocket.TestHandler;
import jrocket.Utils;

public abstract class Matchers extends TestHandler {
	
	public static void assertEquals(int x, int y) {
		if(x == y) passTest(x + " and " + y + " match");
		else failTest(x + " was supposed to be equal to " + y);
	}
	
	public static void assertEquals(String x, String y) {
		if(x == y) passTest(x + " and " + y + " match");
		else
			failTest(
					Utils.toStringFormat(x) + 
					" was supposed to be equal to " + 
					Utils.toStringFormat(y)
			);
	}
	
	public static void assertEquals(double x, double y) {
		if(x == y) passTest(x + " and " + y + " match");
		else failTest(x + " was supposed to be equal to " + y);
	}
	
	public static void assertEquals(float x, float y) {
		if(x == y) passTest(x + " and " + y + " match");
		else failTest(x + " was supposed to be equal to " + y);
	}
	
	public static void assertEquals(int [] x, int [] y) {
		boolean allElementsAreEqual = Utils.compareUniDimArray(x, y);
		
		if(allElementsAreEqual) passTest("both arrays match");
		else failTest("the two arrays were supposed to be equal");
	}
	
	/**
	 * Checks if the first value is greater than the second
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertGreaterThan(int x, int y) {
		if(x > y) passTest(x + " is greater than " + y);
		else failTest(x + " is not greater than " + y);
	}
	
	/**
	 * Checks if the first value is less than the second
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertLessThan(int x, int y) {
		if(x < y) passTest(x + " is less than " + y);
		else failTest(x + " is not less than " + y);
	}
	
	public static void assertGreaterOrEqual(int x, int y) {
		if(x == y) passTest("");
		else failTest("supposed to be equal");
	}
	
	public static void assertLessOrEqual(int x, int y) {
		if(x == y) passTest("");
		else failTest("supposed to be equal");
	}
	
	public static boolean assertTrue(boolean expr) {
		if(expr != true) failTest("supposed to be equal");
		return true;
	}
	
	public static boolean assertFalse(boolean expr) {
		return false;
	}
}
