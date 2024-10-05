package testing;
import jrocket.Error;

public abstract class Matchers extends Error {
	
	public static boolean assertEquals(int x, int y) {
		return x == y;
	}
	
	public static boolean assertTrue(boolean expr) {
		if(expr != true) failTest("supposed to be equal");
		return true;
	}
	
	public static boolean assertFalse(boolean expr) {
		return false;
	}
}
