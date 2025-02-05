package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Writing code for all the collections in one class
 */
public class Collection {

	public void array() {

		System.out.println("Array method called...");
		// created an array type character
		int[] array;
		// given size for the array
		array = new int[6];
		// initializing elements to the array by using index
		array[0] = 8;
		array[1] = 0;
		array[2] = 8;
		array[3] = 6;
		array[4] = 64;
		array[5] = 28;

		// printing values from the array by using for loop
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element at index: " + i + " : " + array[i]);
		}

		System.out.println();
	}

	public void list() {

		System.out.println("List method called...");
		
		// Created list1 object of list interface
		List<Character> list1 = new ArrayList<Character>();

		// adding elements to the specific indexes
		list1.add(0, 'N');
		list1.add(1, 'E');
		list1.add(2, 'D');

		System.out.println(list1);

		// Created list2 object of list interface
		List<Character> list2 = new ArrayList<Character>();

		// adding elements in list2
		list2.add('A');
		list2.add('R');
		list2.add('Y');
		list2.add('A');
		list2.add('A');

		// adding all list2 elements in list1
		list1.addAll(2, list2);

		System.out.println(list1.get(4));

		System.out.println(list1);

		// removing index 4 element
		list1.remove(4);

		System.out.println(list1);

		// Setting element in specific index
		list1.set(0, 'S');

		System.out.println(list1);
		System.out.println();

	}

	public void linkedList() {

		System.out.println("Linked List method called");
		int size = 7;
		List<Integer> list = new LinkedList<Integer>();

		for (int i = 1; i <= size; i++)
			list.add(i);

		// Printing elements of list
		System.out.println(list);

		// Remove element at index 3
		list.remove(3);// index

		// Displaying the list after deletion
		System.out.println(list);

		// Printing elements one by one
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
	}

	public void hashMap() {
		System.out.println("Hash Map method called");
		Map<Integer, String> map = new HashMap<Integer, String>();

		// setting keys and values
		map.put(1, "Dog");
		map.put(2, "Cat");
		map.put(3, "Cow");

		System.out.println("Animal names: ");
		
		// printing the value if it contains the key
		if (map.containsKey(2)) {
			System.out.println("Key 2 : " + map.get(2));
		}
		System.out.println();

		// printing all the keys and values of map using for each loop
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println();
		
		// removing value using key
		map.remove(3);

		// printing all the keys and values of map using for each loop
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Collection collection = new Collection();

		collection.array();
		collection.list();
		collection.linkedList();
		collection.hashMap();

	}

}
