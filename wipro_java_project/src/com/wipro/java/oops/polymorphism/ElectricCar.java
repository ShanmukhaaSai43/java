package com.wipro.java.oops.polymorphism;

public class ElectricCar extends Car{

	public static void main(String args[]) {
		Car car = new ElectricCar();
		car.carType(); //Electric Car
		
		//setting the electric details
		car.setCategory("Electric Car");
		car.setBrand("Tata Moters");
		car.setModel("Tata Nexon EV");
		
		System.out.println(car.toString());
		
		
		
	}

}
