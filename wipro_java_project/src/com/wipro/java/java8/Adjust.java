package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

	public static void checkingAdjusters() {
		LocalDate date = LocalDate.now(); // Get current date
		System.out.println("Current date is : " + date);

		// Get first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month is :" + dayOfNextMonth);

		// Get next Monday
		LocalDate nextMonday = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("Next monday from now is : " + nextMonday);

		// Get first day of this month
		LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of this month is :" + firstDayOfMonth);

		// Get last day of this month
		LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of this month is :" + lastDayOfMonth);
	}

	// Main method to call checkingAdjusters()
	public static void main(String[] args) {
		checkingAdjusters();

	}

}
