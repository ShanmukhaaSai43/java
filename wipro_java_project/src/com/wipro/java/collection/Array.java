package com.wipro.java.collection;

/**
 * 
 */
public class Array {

	public static void main(String[] args) {
		char[] array;
		array = new char[4];
		array[0]='j';
		array[1]='o';
		array[2]='h';
		array[3]='n';
		for(int i=0; i< array.length;i++) {
			System.out.println("Element at index: "+ i +" : " + array[i]);
		}
	}

}
