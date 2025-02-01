/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
//class
public class MyClass {

	// member variable
	int num = 5;

	// method to update the value
	public void changeValue(int num) {

		this.num = num;

	}

	// main method
	public static void main(String[] args) {
		// create instance for MyClass class
		MyClass obj = new MyClass();

		obj.changeValue(10);

		System.out.println(obj.num);

	}

}
