/**
 * 
 */
package com.wipro.java.oops;

/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fileds
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/
public class Animal {
	
	//private members
	private String breed; //breed of the animal
	private int age; //age of the animal
	private float weight; //weight of the animal
	private String color; //color of the animal

	//getters and setters for private members
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = "Germam Shepherd";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = 4;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = 22.5f;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = "Black";
	}

	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", age=" + age + ", weight=" + weight + ", color=" + color + "]";
	}

	

}
