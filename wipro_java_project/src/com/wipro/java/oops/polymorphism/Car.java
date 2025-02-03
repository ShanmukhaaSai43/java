package com.wipro.java.oops.polymorphism;

public class Car {
	
	//private properties
	private String category;
	private String brand;
	private String model;
	
	String carType() {
		return category;
	}
	String brand() {
		return brand;
	}
	String model() {
		return model;
	}

	//getters and setters for the members
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	

	@Override
	public String toString() {
		return "Car [category=" + category + ", model=" + model + ", brand=" + brand + "]";
	}
	


}
