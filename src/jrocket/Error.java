package jrocket;

public class Error {
	public static void failTest(String message) {
		System.out.println("FAIL - " + message);
	}
	
	public static void passTest(String message) {
		System.out.println("PASS - " + message);
	}
}
