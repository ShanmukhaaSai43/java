package com.wipro.java.collection;

/**
 * I have created an array and added elements to the array
 */
public class Array {

	public static void main(String[] args) {
		//created an array type character
		char[] array;
		//given size for the array
		array = new char[4];
		//initializing elements to the array by using index
		array[0]='j';
		array[1]='o';
		array[2]='h';
		array[3]='n';
		
		//printing values from the array by using for loop
		for(int i=0; i< array.length;i++) {
			System.out.println("Element at index: "+ i +" : " + array[i]);
		}
	}

}
