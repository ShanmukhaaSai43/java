package com.wipro.java.designpattern.hashmap;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {

	    HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    
	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	    
	 // change element with key 2
	    languages.replace(2, "C++");
	    System.out.println("HashMap using replace(): " + languages);
	    
	 // remove element associated with key 2
	    String value1 = languages.remove(2);
	    System.out.println("Removed value: " + value1);

	    System.out.println("Updated HashMap: " + languages);
	    
	 // iterate through keys only
	    System.out.print("Keys: ");
	    for (Integer key : languages.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterate through values only
	    System.out.print("\nValues: ");
	    for (String value2 : languages.values()) {
	      System.out.print(value2);
	      System.out.print(", ");
	    }
	    
	    // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (java.util.Map.Entry<Integer, String> entry : languages.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }
	  }
}
