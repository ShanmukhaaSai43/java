package com.wipro.java.java8;


	@FunctionalInterface
	interface Shape {
	    // Single abstract method with return type
	    double area();

	    // Default method 1 with return type
	    default String display() {
	        return "Displaying shape details...";
	    }

	    // Default method 2 with return type
	    default String info() {
	        return "This is a shape interface.";
	    }

	    // Static method 1 with return type
	    static String staticMethod1() {
	        return "Static method1 executed in shape interface";
	    }

	    // Static method 2 with return type
	    static String staticMethod2() {
	        return "Static method1 executed in shape interface";
	    }
	}

	// Square class implementing Shape
	class Square implements Shape {
	    private double side;

	    public Square(double side) {
	        this.side = side;
	    }

	    @Override
	    public double area() {
	        return side * side;
	    }
	}

	// Circle class implementing Shape
	class Circle implements Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double area() {
	        return Math.PI * radius * radius;
	    }
	}

	// Rectangle class implementing Shape
	class Rectangle implements Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double area() {
	        return length * width;
	    }
	}

public class ShapeTest {

	// Main class to test
	    public static void main(String[] args) {
			Shape square = new Square(5);
	        Shape circle = new Circle(4);
	        Shape rectangle = new Rectangle(6, 3);

	        System.out.println("Square Area: " + square.area());
	        System.out.println("Circle Area: " + circle.area());
	        System.out.println("Rectangle Area: " + rectangle.area());

	        // Calling and printing default methods
	        System.out.println(square.display());
	        System.out.println(circle.info());

	        // Calling and printing static methods
	        System.out.println(Shape.staticMethod1());
	        System.out.println(Shape.staticMethod2());
	    }
	

}
