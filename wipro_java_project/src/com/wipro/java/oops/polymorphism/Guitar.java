/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * Child class
 */
public class Guitar extends Instrument {

	public String playSound() {
		return getName() + " :Playing music";
	}

	public static void main(String[] args) {
		Instrument instrument = new Guitar();
		instrument.setName("Guitar");
		instrument.displayDetails();
		System.out.println(instrument.playSound());

	}

}
