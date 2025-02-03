package com.wipro.java.oops.encapsulation;

/**
 * object is the super parent class of every class
 */
public class Animal {
	private String name;
	private float height;

	/**
	 * @param name
	 * @param height
	 */
	// Parameterized constructor
	public Animal(String name, float height) {
		super(); // calls the root parent class which is object
		this.name = name;
		this.height = height;
	}
	
	//getters and setters for the properties
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		if (height > 0) {
			this.height = height;
		} else {
			System.out.println("height cannot be negative or zero.");
		}
	}

	public static void main(String args[]) {
		//creating the object for Animal class and passing the values.
		Animal animal = new Animal("Lion", 3.5f);
		System.out.println(animal.getName());
		System.out.println(animal.getHeight());

		animal.setHeight(4);
		System.out.println(animal.getName());
		System.out.println(animal.getHeight());

		animal.setHeight(0);// passing invalid input

	}

}
