/**
 * 
 */
package com.wipro.java.exception;

/**
 * Generating unchecked exception by giving negative array size
 */
public class UncheckedExceptionExample {

	public static void main(String[] args) {
		try {
			int size = -5;
			int [] arr = new int[size];
			
		} 
		catch (NegativeArraySizeException nase) {
			System.out.println("Negative array size exception happened...");
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		

	}

}
