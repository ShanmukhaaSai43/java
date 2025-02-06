package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalNameSorting implements Comparator<Animal> {

	//Sorting by name 
		@Override
		public int compare(Animal animal1, Animal animal2) {
			
			return animal1.getName().compareTo(animal2.getName());
		}


		public static void main(String[] args) {
			//Creating a list of animals
			ArrayList<Animal> animal = new ArrayList<>();
			animal.add(new Animal("Dog", 4));
			animal.add(new Animal("Cat", 3));
			animal.add(new Animal("Elephant", 2));
			
			//Sort animals by name
			Collections.sort(animal, new AnimalNameSorting());
			System.out.println("\nAnimals sorted by name: ");
			for(Animal a : animal) {
				System.out.println(a.getName() + " " + a.getAge());
			}

		}
}
