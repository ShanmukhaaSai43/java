/**
 * 
 */
package com.wipro.java.oops;

/**
 *  Parent class is Employee 
 *  Child class id Developer
 *  extends is a keyword
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		
	}
	public static void main(String a[]) {
		//Child object is instantiated from child constructor
		//Parent class consumes the properties and behaviors of child class
		
		Employee employee = new Developer();
		
		//setting the developer details
		employee.setEmployeeId(7);
		employee.setEmployeeName("Suhaas");
		employee.setEmailId("suhaas123@gmail");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmailId());
		
	}

}
