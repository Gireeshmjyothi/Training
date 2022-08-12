package com.josh.java.java8features;

import java.util.Arrays;
import java.util.List;

/*
 * In this class we used lambda expression and  asList method to add multiple 
 * data in single way
 */
public class LambdaExpression {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 5, 4, 10, 2, 7, 5, 9, 10, 9);
		list.stream().distinct().forEach(m -> System.out.print(m + " "));
		System.out.println();
		List.of(1, 2, 4, 4, 5, 6).stream().filter(x -> x % 2 == 0).forEach(e -> System.out.print(e + " "));

		// lambda expression to define the calculate method
		Calculator value = x -> x * x;
		Calculator value1 = x -> x + x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = value.calculate(5);
		int result = value1.calculate(5);
		System.out.println("\n" + ans + "," + result);
	}
}
