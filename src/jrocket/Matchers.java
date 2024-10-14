/*
                      GNU GENERAL PUBLIC LICENSE
                       Version 3, 29 June 2007

 Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.

 Proudly developed by AndrewNation
 */

package jrocket;

/**
 * It includes the matchers and inherits the methods from the TestHandler class.
 */

public abstract class Matchers extends TestHandler {
	
	/**
	 * Checks if two values are equal (in type and value)
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertEquals(int x, int y) {
		if(x == y) passTest(x + " and " + y + " match");
		else failTest(x + " was supposed to be equal to " + y);
	}
	
	/**
	 * Checks if two values are equal (in type and value)
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertEquals(String x, String y) {
		if(x == y) passTest(x + " and " + y + " match");
		else
			failTest(
					Utils.toStringFormat(x) + 
					" was supposed to be equal to " + 
					Utils.toStringFormat(y)
			);
	}
	
	/**
	 * Checks if two values are equal (in type and value)
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertEquals(double x, double y) {
		if(x == y) passTest(x + " and " + y + " match");
		else failTest(x + " was supposed to be equal to " + y);
	}
	
	/**
	 * Checks if two values are equal (in type and value)
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertEquals(float x, float y) {
		if(x == y) passTest(x + " and " + y + " match");
		else failTest(x + " was supposed to be equal to " + y);
	}
	
	/**
	 * Checks if two arrays of values are equal (in type and value)
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertEquals(int [] x, int [] y) {
		boolean allElementsAreEqual = Utils.compareUniDimArray(x, y);
		
		if(allElementsAreEqual) passTest("both arrays match");
		else failTest("the two arrays were supposed to be equal");
	}
	
	/**
	 * Checks if two arrays of values are equal (in type and value)
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertEquals(float [] x, float [] y) {
		boolean allElementsAreEqual = Utils.compareUniDimArray(x, y);
		
		if(allElementsAreEqual) passTest("both arrays match");
		else failTest("the two arrays were supposed to be equal");
	}
	
	/**
	 * Checks if two arrays of values are equal (in type and value)
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertEquals(double [] x, double [] y) {
		boolean allElementsAreEqual = Utils.compareUniDimArray(x, y);
		
		if(allElementsAreEqual) passTest("both arrays match");
		else failTest("the two arrays were supposed to be equal");
	}
	
	/**
	 * Checks if two arrays of values are equal (in type and value)
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertEquals(String [] x, String [] y) {
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
	 * Checks if the first value is greater than the second
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertGreaterThan(float x, float y) {
		if(x > y) passTest(x + " is greater than " + y);
		else failTest(x + " is not greater than " + y);
	}
	
	/**
	 * Checks if the first value is greater than the second
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertGreaterThan(double x, double y) {
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
	
	/**
	 * Checks if the first value is less than the second
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertLessThan(float x, float y) {
		if(x < y) passTest(x + " is less than " + y);
		else failTest(x + " is not less than " + y);
	}
	
	/**
	 * Checks if the first value is less than the second
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertLessThan(double x, double y) {
		if(x < y) passTest(x + " is less than " + y);
		else failTest(x + " is not less than " + y);
	}
	
	/**
	 * Checks if the first value is greater than or equal to the second value
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertGreaterOrEqual(int x, int y) {
		if(x > y || x == y) passTest(x + " is greater than/equal to " + y);
		else failTest(x + " is not less greater than/equal to " + y);
	}
	
	/**
	 * Checks if the first value is greater than or equal to the second value
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertGreaterOrEqual(float x, float y) {
		if(x > y || x == y) passTest(x + " is greater than/equal to " + y);
		else failTest(x + " is not less greater than/equal to " + y);
	}
	
	/**
	 * Checks if the first value is greater than or equal to the second value
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertGreaterOrEqual(double x, double y) {
		if(x > y || x == y) passTest(x + " is greater than/equal to " + y);
		else failTest(x + " is not less greater than/equal to " + y);
	}
	
	/**
	 * Checks if the first value is less than or equal to the second value
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertLessOrEqual(int x, int y) {
		if(x < y || x == y) passTest(x + " is less than/equal to " + y);
		else failTest(x + " is not less less than/equal to " + y);
	}
	
	/**
	 * Checks if the first value is less than or equal to the second value
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertLessOrEqual(float x, float y) {
		if(x < y || x == y) passTest(x + " is less than/equal to " + y);
		else failTest(x + " is not less less than/equal to " + y);
	}
	
	/**
	 * Checks if the first value is less than or equal to the second value
	 * @param x the first value
	 * @param y the second value
	 */
	public static void assertLessOrEqual(double x, double y) {
		if(x < y || x == y) passTest(x + " is less than/equal to " + y);
		else failTest(x + " is not less less than/equal to " + y);
	}
	
	/**
	 * Checks if an expression evaluates to true
	 * @param expr the expression to be evaluated
	 */
	public static void assertTrue(boolean expr) {
		if(expr != true) failTest(expr + " supposed to be true");
		else passTest(expr + " evaluates to true");
	}
	
	/**
	 * Checks if an expression evaluates to false
	 * @param expr the expression to be evaluated
	 */
	public static void assertFalse(boolean expr) {
		if(expr != true) failTest(expr + " supposed to be false");
		else passTest(expr + " evaluates to false");
	}
}
