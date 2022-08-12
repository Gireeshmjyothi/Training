package com.josh.java.java8features;

import java.util.function.BiFunction;

/*
 * Driver class is used to run the multiple classes in it
 */
public class MainDriver {

	public static void main(String[] args) {
		// Creating a customer object and here customer might go for different bank
		// according to their own interest
		Bank customerOne = new CustomerOne();
		customerOne.createNewAccount();
		customerOne.iciciBank();
		// Creating another customer object
		System.out.println("-------------------");
		Bank customerTwo = new CustomerTwo();
		customerTwo.createNewAccount();
		customerTwo.sbiBank();
		// Method Reference
		BiFunction<Integer, Integer, Integer> addref = MethodReference::add;
		int result = addref.apply(10, 20);
		System.out.println(result);
		MethodReference ref = new MethodReference();
		BiFunction<String, String, String> stringref = ref::conCat;
		String string = stringref.apply("Anirudh", "Naik");
		System.out.println(string);

	}

}
