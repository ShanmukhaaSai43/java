/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * Parent Class
 */
public class Instrument {
	// private property
	private String name;

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String playSound() {
		return "Playing music";
	}

	public void displayDetails() {
		System.out.println("Instrument: " + name);
	}
}
