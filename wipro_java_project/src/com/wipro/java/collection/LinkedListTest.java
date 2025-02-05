package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 */
public class LinkedListTest {

	public static void main(String[] args) {
		
		int size = 6;
		List<Integer> list = new LinkedList<Integer>();
		
		for (int i = 1; i <= size; i++)
			list.add(i);
 
		// Printing elements of list
		System.out.println(list);
 
		// Remove element at index 4
		list.remove(4);// index
 
		// Displaying the list after deletion
		System.out.println(list);
 
		// Printing elements one by one
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
 
	}

}
