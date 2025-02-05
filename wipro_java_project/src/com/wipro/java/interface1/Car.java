/**
 * 
 */
package com.wipro.java.interface1;

/**
 * Implementing body for the interface
 */
public class Car implements Vehical{

	public static void main(String[] args) {
		Vehical car = new Car();
		car.start();
	}

	@Override
	public void start() {
		System.out.println("Car is starting...");
		
	}

}
