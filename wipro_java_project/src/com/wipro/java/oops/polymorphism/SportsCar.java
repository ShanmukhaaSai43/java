package com.wipro.java.oops.polymorphism;

public class SportsCar extends Car{

	public static void main(String[] args) {
		Car car = new SportsCar();
		car.carType(); //Sports Car
		
		//setting the sports car details
		car.setCategory("Sports Car");
		car.setBrand("Ferrari");
		car.setModel("Ferrari Enzo");
		
		System.out.println(car.toString());
	}

}
