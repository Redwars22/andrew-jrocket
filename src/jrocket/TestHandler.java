package jrocket;

/**
 * class TestHandler
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
	 * 
	 * @return the number of failed tests
	 */
	public static int getFailedTests() {
		return failedTests;
	}

	public static void setFailedTests(int failedTests) {
		TestHandler.failedTests = failedTests;
	}

	public static int getPassedTests() {
		return TestHandler.passedTests;
	}

	public static void setPassedTests(int passedTests) {
		TestHandler.passedTests = passedTests;
	}
}
