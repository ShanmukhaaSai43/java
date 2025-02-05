package com.wipro.java.exception;
import java.io.*;
/**
 * Checked exception
 */
public class CheckedExeceptionExample {

	public static void main(String[] args) {
		try {
			File file = new File("file does not exist");
			FileReader reader = new FileReader(file);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

	}

}
