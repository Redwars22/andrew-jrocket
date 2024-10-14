package jrocket;

/**
 * This class extends the Matchers class and has access to all the matchers
 * It also controls the test and prints the result to the screen:
 * number of tests passed and the time elapsed
 */
public class JRocketTesting extends Matchers {
	private static float time_start;
	private static float time_end;
	
	/**
	 * It begins the tests
	 * @param suite the name of the test suite
	 */
	public static void begin(String suite) {
		System.out.print("JRocket - Andrew Testing Library for Java 0.1 RELEASE PREVIEW\n\n");
		System.out.println("> Running test suite: " + suite);
		JRocketTesting.time_start = System.nanoTime();
	}
	
	/**
	 * It causes the test to end. It also calculates elapsed time and
	 * shows the number of passed and failed tests.
	 */
	public static void end() {
		System.out.println("\n" + TestHandler.getPassedTests() + " passed, " + TestHandler.getFailedTests() + " failed");
		JRocketTesting.time_end = System.nanoTime();
		float timeElapsed = (JRocketTesting.time_end - JRocketTesting.time_start)/1000000;
		System.out.println("Finished in " + timeElapsed + "ms");
	}
}
