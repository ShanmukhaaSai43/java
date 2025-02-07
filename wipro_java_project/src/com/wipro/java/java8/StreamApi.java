package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
		//Creating a list of numbers
		List<Integer> numbers = Arrays.asList(7, 18, 8, 31, 6, 33);
		
		//Sorting the list using Stream API
		List<Integer> sortedNumbers = numbers.stream()
		   .sorted()
		   .collect(Collectors.toList());
		
		//Printing the sorted list
		System.out.println(sortedNumbers);
		
		//Creating another list of numbers
		List<Integer> numbers1 = Arrays.asList(93, 15, 8, 11, 23);
		
		//Finding the minimum number
		int min = numbers1.stream().min(Integer::compare).get();
		
		//Finding the maximum number
		int max = numbers1.stream().max(Integer::compare).get();
		
		//Printing minimum and maximum values in the list
		System.out.println(min);
		System.out.println(max);

	}

}
