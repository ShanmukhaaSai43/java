package com.wipro.java.collection;

public class AnimalPojo {

	private String name;
	private int age;
	
	//Parameterized constructor
	public AnimalPojo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}
