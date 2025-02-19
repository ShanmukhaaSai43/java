package com.wipro.java.hashmap.usecase;

public class Student {
	String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "(" + name + ", Roll No: " + rollNumber + ")";
    }
}
