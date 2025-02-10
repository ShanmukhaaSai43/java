package com.wipro.java.java8.usecase.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee employee;

	@Before
	public void setUp() {
		employee = new Employee(1, "Ram", 5000.0);
	}

	@Test
	public void testGetId() {
		assertEquals(1, employee.getId());
	}

	@Test
	public void testGetName() {
		assertEquals("Ram", employee.getName());
	}

	@Test
	public void testGetSalary() {
		assertEquals(5000.0, employee.getSalary(), 0.01);
	}

	@Test
	public void testIncreaseSalary() {
		employee.increaseSalary(1000.0);
		assertEquals(6000.0,employee.getSalary(),0.01);
	}

}