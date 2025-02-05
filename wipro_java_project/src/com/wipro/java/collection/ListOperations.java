package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created two objects of list interface to do list operations
 */
public class ListOperations {

	public static void main(String[] args) {
		
		//Created list1 object of list interface
		List<Integer> list1 = new ArrayList<Integer>();
		
		//adding elements to the specific indexes
		list1.add(0, 7);
		list1.add(1,0);
		
		System.out.println(list1);
		
		//Created list2 object of list interface
		List<Integer> list2 = new ArrayList<Integer>();
		
		//adding elements in list2
		list2.add(9);
		list2.add(6);
		list2.add(4);
		list2.add(7);
		list2.add(3);
		
		//adding all list2 elements in list1
		list1.addAll(1,list2);
		
		System.out.println(list1);
		
		//removing index 1 element
		list1.remove(1);
		
		System.out.println(list1);
		
		//Setting element in specific index
		list1.set(0, 5);
		
		System.out.println(list1);
		System.out.println(list1.get(2));

	}

}
