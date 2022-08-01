package com.josh.java.stringclasses;

public class StringBufferClass {
	/*
	 * reverseString method is used to reverse the string using inbuilt method of
	 * StringBuffer class reverse() method.
	 */
	public void reverseString(String word) {
		StringBuffer stringName = new StringBuffer(word);
		System.out.println(stringName.reverse());
	}
}
