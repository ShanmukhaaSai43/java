package com.wipro.java.java8;

//First Interface
interface InterfaceA {
	default void show() {
		System.out.println("show method in InterfaceA");
	}
}

//Second Interface
interface InterfaceB {
	default void show() {
		System.out.println("show method in InterfaceA");
	}
}

//Class implementing both interfaces
class Default implements InterfaceA, InterfaceB {

	@Override
	public void show() {

		// Calling InterfaceA's show method
		InterfaceA.super.show();

		// Calling InterfaceB's show method
		InterfaceB.super.show();
	}

	public static void main(String[] args) {
		Default obj = new Default();
		obj.show();
	}
}
