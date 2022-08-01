package com.josh.java.stringclasses;

public class StringClass {
	/*
	 * This method is used to find the number of vowels and consonants in the given
	 * word
	 */
	public void vowelsConsonants(String word) {
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i <word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}
		System.out.println("Number of vowels :" + vowels);
		System.out.println("Number of consonents :" + consonants);
	}
}
