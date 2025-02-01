/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Car {

	// properties and behaviours
	// brand, speed, color => properties
	// maruti, 40km/hr, red => behaviours
	// ford, 60km/hr, white

	// members
	String brandValue;
	int mileageValue;

	// constructor
	Car(String brand, int mileage) {
		this.brandValue = brand;
		this.mileageValue = mileage;
	}

	// method => combination of properties & behaviours
	void display() {
		System.out.println("Car brand: " + brandValue + " Car mileage " + mileageValue);
	}

	// main method which is he starting point of the class
	public static void main(String[] args) {

		// object is a instance of a class
		// maruti is a instance of car

		// Class objectname = new Constructor(parameters)
		Car carobject1 = new Car("maruti", 120);
		Car carobject2 = new Car("ford", 30);
		carobject1.display();
		carobject2.display();

	}

}
