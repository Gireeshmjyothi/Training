package com.josh.java.stringclasses;

import java.util.Scanner;

/*
 * DiverClass is used to drivers the multiple classes in it
 */
public class DriverClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to get vowels and consonants from the given string and all are in lowercase");
		System.out.println("Press 2 to get the reverse string");
		System.out.println("Press 3 to get the reverse string without using inbuilt mehtod");
		int userInput = scanner.nextInt();
		switch (userInput) {
		case 1:
			StringClass stringref = new StringClass();
			System.out.println("Enter the word");
			String string = scanner.next();
			stringref.vowelsConsonants(string);
			break;
		case 2:
			StringBufferClass bufferref = new StringBufferClass();
			System.out.println("Enter the word");
			String buffer = scanner.next();
			bufferref.reverseString(buffer);
			break;
		case 3:
			StringBuilderClass builderref = new StringBuilderClass();
			System.out.println("Enter the word");
			String builder = scanner.next();
			builderref.reverseString(builder);
			break;
		default: {
			System.err.println("Invalid input");
		}
		scanner.close();
		}
	}
}
