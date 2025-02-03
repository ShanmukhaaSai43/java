/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {

	
	// member variables
	String name;
	String color;

	// constructor
	Flower(String name, String color) {
		this.name = name;
		this.color = color;
	}

	// method to display the output
	void display() {
		System.out.println("Name of the color is " + name + " and the color is " + color);
	}

	// main method
	public static void main(String[] args) {

		// objects for flower class
		Flower flower1 = new Flower("jasmin", "white");
		Flower flower2 = new Flower("marigold", "yellow");

		// calling display method
		flower1.display();
		flower2.display();

	}

}
