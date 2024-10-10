package testing;
import jrocket.TestHandler;

public class JRocketTesting extends Matchers {
	public static void begin() {
		System.out.println("JROCKET - Andrew Testing Library for Java");
	}
	
	public static void end() {
		System.out.println(TestHandler.getPassedTests() + " passed," + TestHandler.getFailedTests() + " failed");
	}
}
