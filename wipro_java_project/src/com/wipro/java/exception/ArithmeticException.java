/**
 * 
 */
package com.wipro.java.exception;

/**
 * Writing a mistaken code in try block. 
 * Catching the exception in catch block.
 * "finally" block is used to execute the code irrespective of exception.
 */
public class ArithmeticException {

	public static void main(String[] args) {
		try {
			int numerator = 70;
			int denominator = 0;

			// Module operation with zero.
			int result = numerator % denominator;
			System.out.println(result);

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("I'm in finally block.");
		}

	}

}
