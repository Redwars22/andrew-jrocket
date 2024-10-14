package jrocket;

/**
 * class TestHandler,
 * it passes or fails a specific test
 */
public class TestHandler {
	private static int failedTests;
	private static int passedTests;
	
	/**
	 * @param message receives the text to be print to the screen when the test fails
	 */
	public static void failTest(String message) {
		System.out.println("FAIL - " + message);
		TestHandler.setFailedTests(TestHandler.getFailedTests() + 1);
	}
	
	/**
	 * @param message receives the text to be print to the screen when the test passes
	 */
	public static void passTest(String message) {
		System.out.println("PASS - " + message);
		TestHandler.setPassedTests(TestHandler.getPassedTests() + 1);
	}

	/**
	 * @return the number of failed tests
	 */
	public static int getFailedTests() {
		return failedTests;
	}

	/**
	 * Sets the number of failed tests
	 * @param failedTests
	 */
	public static void setFailedTests(int failedTests) {
		TestHandler.failedTests = failedTests;
	}

	/**
	 * @return the number of passed tests
	 */
	public static int getPassedTests() {
		return TestHandler.passedTests;
	}

	/**
	 * Sets the number of passed tests
	 * @param passedTests
	 */
	public static void setPassedTests(int passedTests) {
		TestHandler.passedTests = passedTests;
	}
}
