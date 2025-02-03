package com.wipro.java.oops.abstraction;

public class Mitsubishi extends Car{

	//giving body for abstract methods
	@Override
	void model() {
		System.out.println("Mitsubishi Lancer Evoluation X");
		
	}

	@Override
	void speed() {
		System.out.println("170km/hr");
		
	}
	public static void main(String args[]) {
		Car car = new Mitsubishi();
		car.model();
		car.speed();
	}

}
