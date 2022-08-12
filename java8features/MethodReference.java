package com.josh.java.java8features;
/*
 * Implementing some methods over here to perform some task for method reference
 */
public class MethodReference {
	
	public MethodReference() {
		System.out.println("Executing non agrs constructor");
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public String conCat(String s1, String s2) {
		return s1 + " " + s2;
	}
}
