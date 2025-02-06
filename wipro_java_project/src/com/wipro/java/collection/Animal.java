package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Animal implements Comparable<Animal> {
	private String name;
	private int age;
	
	//Parameterized constructor
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//implementing body to the abstract method
	public int compareTo(Animal animal) {
		return Integer.compare(this.age, animal.getAge());
	}
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		ArrayList<Animal> arrayList = new ArrayList<>();
		arrayList.add(new Animal("Dog", 4));
		arrayList.add(new Animal("Cat", 1));
		arrayList.add(new Animal("Elephant", 6));
		// Sort animals using Comparable's
		// compareTo method by age
		Collections.sort(arrayList);


		// Display the sorted list of animals
		System.out.println("Animals after sorting by age:");
		for (Animal movie : arrayList) {
			System.out.println(movie.getName() + " " + movie.getAge());
		}
		
}

}
