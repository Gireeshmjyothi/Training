package com.josh.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		// Creating a pattern to be searched
		Pattern pattern = Pattern.compile("josh", Pattern.CASE_INSENSITIVE);

		// Searching above pattern in "geeksforgeeks.org"
		Matcher m = pattern.matcher("joshsoftware.org");

		// Find above string using find() method
		while (m.find()) {
			// Printing the starting and ending indexes of
			// the pattern in text using class method
			// functionalities
			System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
		}

	}
}
