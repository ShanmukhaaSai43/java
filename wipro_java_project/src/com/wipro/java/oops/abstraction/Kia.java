package com.wipro.java.oops.abstraction;

/**
 * Inheriting the abstract class
 */
public class Kia extends Car{

	//giving body for abstract methods
	@Override
	void model() {
		System.out.println("Kia Seltos");
		
	}

	@Override
	void speed() {
		System.out.println("167km/hr");
		
	}
	public static void main(String args[]) {
		Car car = new Kia();
		car.model();
		car.speed();
	}

}
