package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalAgeSorting implements Comparator<Animal> {

			//Sorting by age 
			@Override
			public int compare(Animal animal1, Animal animal2) {
				
				return Integer.compare(animal1.getAge(), animal2.getAge());
			}


			public static void main(String[] args) {
				//Creating a list of animals
				ArrayList<Animal> animal = new ArrayList<>();
				animal.add(new Animal("Dog", 4));
				animal.add(new Animal("Cat", 3));
				animal.add(new Animal("Elephant", 2));
				
				//Sort animals by age
				Collections.sort(animal, new AnimalAgeSorting());
				System.out.println("\nAnimals sorted by age: ");
				for(Animal a : animal) {
					System.out.println(a.getName() + " " + a.getAge());
				}

			}
}
