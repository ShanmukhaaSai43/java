/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * Child Class
 */
public class Drum extends Instrument {

	public String playSound() {
		return getName() + " :Playing music";
	}

	public static void main(String[] args) {
		Instrument instrument = new Drum();
		instrument.setName("Drum");
		instrument.displayDetails();
		System.out.println(instrument.playSound());

	}

}
