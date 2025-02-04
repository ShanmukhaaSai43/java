package com.wipro.java.oops.library;

/**
 * DVD class is inheriting LibraryItem class to get properties and behaviors
 * from parent class
 * 
 * Child class object created using parent type reference which is called
 * Polymorphism.
 */
public class DVD extends LibraryItem {

	private String direction;
	private int duration;

	public DVD(String title, int year, String direction, int duration) {
		super(title, year);
		this.direction = direction;
		this.duration = duration;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public void displayDetails() {
		System.out.println("DVD Title: " + getTitle());
		System.out.println("Year: " + getYear());
		System.out.println("Director: " + direction);
		System.out.println("Duration " + duration + " minutes");

	}

	public static void main(String args[]) {
		LibraryItem libraryItem = new DVD("Interstellar", 2014, "Christopher Nolan", 169);
		libraryItem.displayDetails();
	}

}
