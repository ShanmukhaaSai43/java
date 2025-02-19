package com.wipro.java.hashmap;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		// Creating a HashMap
		HashMap<Integer, String> map = new HashMap<>();

		// Adding elements to the HashMap
		map.put(1, "Abbas");
		map.put(2, "Sandeep");
		map.put(3, "Ajith");
		map.put(4, "Upendra");

		// Displaying the HashMap
		System.out.println("HashMap Elements:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// Checking if a key exists
		int keyToCheck = 2;
		if (map.containsKey(keyToCheck)) {
			System.out.println("Key " + keyToCheck + " exists in the HashMap.");
		}

		// Removing an element
		map.remove(3);
		System.out.println("HashMap after removing key 3: " + map);
	}
}
