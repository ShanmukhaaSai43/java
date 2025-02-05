package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Example for Map it contains keys and values
 */
public class MapImplementation {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//setting keys and values
		map.put(1, "Stark");
		map.put(2, "Beratheon");
		map.put(3, "Lannister");
		map.put(4, "Targaryan");
		
		//printing the value if it contains the key
		if(map.containsKey(4)) {
			System.out.println("Key 4 : "+ map.get(4));
		}
		System.out.println();
		
		//printing all the keys and values of map using for each loop
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println();
		//removing value using key
		map.remove(3);
		
		//printing all the keys and values of map using for each loop
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
