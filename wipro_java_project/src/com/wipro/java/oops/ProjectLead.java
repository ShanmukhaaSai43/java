/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class is Employee
 *  Child class id projectLead
 *  extends is a keyword 
 */
public class ProjectLead extends Employee {

	/**
	 * 
	 */
	public ProjectLead() {
		
	}
	public static void main(String a[]) {
		//Child object is instantiated from child constructor
		//Parent class consumes the properties and behaviors of child class
		
		Employee employee = new ProjectLead();
		
		//setting the project lead details
		employee.setEmployeeId(4);
		employee.setEmployeeName("bhasker");
		employee.setEmailId("bhasker@gmail");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmailId());
		
	}

}
