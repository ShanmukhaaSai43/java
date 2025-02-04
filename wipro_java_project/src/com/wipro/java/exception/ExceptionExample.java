/**
 * 
 */
package com.wipro.java.exception;

/**
 * Checked and Unchecked exception examples
 */
public class ExceptionExample {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException npe) {
			System.out.println("Unchecked exception: "+ npe.toString());
		}
		catch(Exception e) {
			System.out.println("Unchecked exception: "+ e.toString());
		}
		
		try {
			Class.forName(null);
		} catch (Exception e) {
			System.out.println("Checked Exception: " + e.toString());
		}

	}

}
