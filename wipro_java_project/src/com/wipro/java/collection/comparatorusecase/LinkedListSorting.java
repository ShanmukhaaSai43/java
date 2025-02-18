package com.wipro.java.collection.comparatorusecase;

import java.util.*;

//Custom Comparator to sort LinkedList in ascending order
class CustomComparator implements Comparator<Integer> {
 @Override
 public int compare(Integer a, Integer b) {
     return a.compareTo(b); // Ascending order
 }
}

public class LinkedListSorting {
 public static void main(String[] args) {
     LinkedList<Integer> list = new LinkedList<>();
     
     // Adding elements to LinkedList
     list.add(5);
     list.add(2);
     list.add(9);
     list.add(1);
     list.add(7);
     
     // Sorting using Comparator
     Collections.sort(list, new CustomComparator());
     
     // Printing sorted LinkedList
     System.out.println("Sorted LinkedList: " + list);
 }
}
