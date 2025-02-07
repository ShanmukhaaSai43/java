package com.wipro.java.java8;

public class StringApi {

	public static void main(String[] args) {
		String name = "Power Star";
		
		//Printing the length of the string
		System.out.println(name.length());
		
		//Printing the character at index 6
		System.out.println(name.charAt(6));
		
		//Printing substring from index 6 to 10
		System.out.println(name.substring(6, 10));
		
		//Checking if the string contains "ow"
		System.out.println(name.contains("ow"));
		
		//Splitting the string based on space
		String[] a = name.split(" ");
		for(String str : a) {
		System.out.println(str);
		}
		


	}

}
