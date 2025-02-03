package com.wipro.java.oops;

/**
 * Parent class is Employee
 *  Child class id Manager 
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		
	}
	
	public static void main(String a[]) {
		//Child object is instantiated from child constructor
		//Parent class consumes the properties and behaviors of child class
		
		Employee employee = new Developer();
		
		//setting the manager details
		employee.setEmployeeId(2);
		employee.setEmployeeName("Kamlesh");
		employee.setEmailId("kamlesh2@gmail");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmailId());
		
	}

}
