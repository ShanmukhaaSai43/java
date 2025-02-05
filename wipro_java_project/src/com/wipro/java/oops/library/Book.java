package com.wipro.java.oops.library;

/**
 * Book class is inheriting LibraryItem class to get properties and behaviors
 * from parent class
 * 
 * Child class object created using parent type reference which is called
 * Polymorphism.
 */
public class Book extends LibraryItem {

	private String author;

	public Book(String tite, int year, String author) {
		super(tite, year);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void displayDetails() {
		System.out.println("Book Tile: " + getTitle());
		System.out.println("Year: " + getYear());
		System.out.println("Author: " + author);
	}

	public static void main(String args[]) {
		// parent class object is accessing the child class properties
		LibraryItem libraryItem = new Book("A song of Ice and Fire", 1948, "George R. R. Martin");
		libraryItem.displayDetails();
	}
}
