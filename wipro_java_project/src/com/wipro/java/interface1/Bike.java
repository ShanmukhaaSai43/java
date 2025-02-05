/**
 * 
 */
package com.wipro.java.interface1;

/**
 * Implementing body for the interface
 */
public class Bike implements Vehical{

	public static void main(String[] args) {
		Vehical bike = new Bike();
		bike.start();

	}

	@Override
	public void start() {
		System.out.println("Bike is Starting...");
		
	}

}
