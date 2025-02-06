package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Year implements Comparator<Movie1> {

	//Sorting by year 
			@Override
			public int compare(Movie1 m1, Movie1 m2) {
				
				return Integer.compare(m1.getYear(), m2.getYear());
			}


			public static void main(String[] args) {
				//Creating a list of movies
				ArrayList<Movie1> m1 = new ArrayList<>();
				m1.add(new Movie1("Fight Club", 8.8, 1999));
				m1.add(new Movie1("Seven", 8.6, 1995));
				m1.add(new Movie1("The Killer", 6.7, 2023));
				
				//Sort movies by year
				Collections.sort(m1, new Year());
				System.out.println("\nMovies sorted by year: ");
				for(Movie1 m : m1) {
					System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
				}

			}
}
