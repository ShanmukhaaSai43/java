package com.wipro.java.interface1;

/**
 * Implementing body for the Interface classes.
 */
public class Person implements Work, Study{

	@Override
	public void doWork() {
		System.out.println("Person is working.");
		
	}
	@Override
	public void doStudy() {
		System.out.println("Person is Studying Java.");
		
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.doWork();
		person.doStudy();
		

	}


}
