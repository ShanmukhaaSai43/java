/**
 * 
 */
package com.wipro.java.oops.library;

/**
 * Achieving Encapsulation by giving setters and getters
 * 
 * Achieving abstraction by creating an abstract class and if we create one
 * abstract method then we should make class type as abstract by using keyword
 * "abstract".
 */
abstract class LibraryItem {

	private String title;
	private int year;

	/**
	 * @param title
	 * @param year
	 */
	public LibraryItem(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public abstract void displayDetails();

}
