package com.josh.java.stringclasses;

public class StringBuilderClass {
	/*
	 * Here reversing the string without using inbuilt method
	 */
	public void reverseString(String word) {
		StringBuilder stringName = new StringBuilder(word);
		StringBuilder stringEmpty = new StringBuilder("");
		for (int i = stringName.length() - 1; i >= 0; i--) {
			char ch = stringName.charAt(i);
			stringEmpty.append(ch);
		}
		System.out.println( stringEmpty);
	}
}
