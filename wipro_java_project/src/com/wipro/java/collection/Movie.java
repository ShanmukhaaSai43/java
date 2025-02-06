package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Implementing Comparable interface and sorting based on rating
 */
public class Movie implements Comparable<Movie> {

	private String name;
	private double rating;
	private int year; 
	
	//Parameterized constructor
	public Movie(String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	//implementing body to the abstract method
	public int compareTo(Movie movie) {
		return Double.compare(this.rating, movie.rating );
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		ArrayList<Movie> arrayList = new ArrayList<>();
		arrayList.add(new Movie("Star Wars", 8.7, 1977));
		arrayList.add(new Movie("Empie Strikes Back", 8.8, 1980));
		arrayList.add(new Movie("Return of the Jedi", 8.4, 1983));
		// Sort movies using Comparable's
		// compareTo method by year
		Collections.sort(arrayList);


		// Display the sorted list of movies
		System.out.println("Movies after sorting by year:");
		for (Movie movie : arrayList) {
			System.out.println(movie.getName() + " " +movie.getRating() + " " + movie.getYear());
		}
		

	}



}
