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
 * Includes a few methods that are useful for converting values or printing data during tests.
 */
public final class Utils {
	/**
	 * Wraps a string value inside ""
	 * @param x a string value
	 * @return a string value wrapped inside ""
	 */
	public static String toStringFormat(String x) {
		return "\"" + x + "\"";
	}
	
	/**
	 * Compares two unidimensional arrays of integers
	 * @param x the first array
	 * @param y the second array
	 * @return if the two arrays are the same
	 */
	public static boolean compareUniDimArray(int [] x, int [] y) {
		for(int i = 0; i < x.length; i++)
			if(x[i] != y[i])
				return false;
		
		return true;
	}

	/**
	 * Compares two unidimensional arrays of integers
	 * @param x the first array
	 * @param y the second array
	 * @return if the two arrays are the same
	 */
	public static boolean compareUniDimArray(String[] x, String[] y) {
		for(int i = 0; i < x.length; i++)
			if(x[i] != y[i])
				return false;
		
		return true;
	}

	/**
	 * Compares two unidimensional arrays of integers
	 * @param x the first array
	 * @param y the second array
	 * @return if the two arrays are the same
	 */
	public static boolean compareUniDimArray(double[] x, double[] y) {
		for(int i = 0; i < x.length; i++)
			if(x[i] != y[i])
				return false;
		
		return true;
	}

	/**
	 * Compares two unidimensional arrays of integers
	 * @param x the first array
	 * @param y the second array
	 * @return if the two arrays are the same
	 */
	public static boolean compareUniDimArray(float[] x, float[] y) {
		for(int i = 0; i < x.length; i++)
			if(x[i] != y[i])
				return false;
		
		return true;
	}
}
