package com.josh.java.autoboxingandunboxing;

/*
 * This class giving an example to Auto boxing and Unboxing concept
 */
public class AutoboxingAndUnboxing {
	// Main driver method
	public static void main(String[] args) {
		
		// Creating an integer object
		// with custom value
		Integer value = new Integer(50);
		int number = value;
		
		// Print statements
		System.out.println("Value of Integer :" + value);
		System.out.println("Value of int :" + number);
		
		// Autoboxing of character
		Character character = 'a';
		char ch = character;
		
		// Print statements
		System.out.println("Value of Character :" + character);
		System.out.println("Value of char :" + ch);
	}
}
