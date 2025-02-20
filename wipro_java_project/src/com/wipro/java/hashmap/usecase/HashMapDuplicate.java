package com.wipro.java.hashmap.usecase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDuplicate {
	public static void main(String[] args) {
        // HashMap to store roll numbers and list of student names
        Map<Integer, List<String>> studentMap = new HashMap<>();

        // List of students with duplicate roll numbers
        Student[] students = {
            new Student("Chandu", 101),
            new Student("Shanmukh", 102),
            new Student("Lokesh", 103),
            new Student("Sathi", 103),
            new Student("Sai kiran", 104), // Duplicate
            new Student("Ganesh", 105),
            new Student("Ajay", 106),
            new Student("Uppi", 102), // Duplicate
            new Student("Rana", 107),
            new Student("Jaga", 108)
        };

        // Populating the HashMap
        for (Student student : students) {
            studentMap.putIfAbsent(student.rollNumber, new ArrayList<>());
            studentMap.get(student.rollNumber).add(student.name);
        }

        // Printing the HashMap
        for (Map.Entry<Integer, List<String>> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
