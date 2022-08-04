package com.josh.java.collectionframework;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// Creating an empty object with default constructor and passing random values
		TreeSet<Integer> num = new TreeSet<>();
		num.add(10);
		num.add(50);
		num.add(30);
		num.add(40);
		num.add(20);
		// Creating implicitly it follow the ascending order
		for (int number : num) {
			System.out.println(number);
		}
		// Creating an empty object with parameterized constructor and passing some
		// random integer values
		System.out.println("------------------------");
		TreeSet<Integer> sorting = new TreeSet<>(new DemoComparator());
		sorting.add(10);
		sorting.add(40);
		sorting.add(50);
		// sorting.add(null); null value not allowed
		sorting.add(20);
		sorting.add(30);
		// sorting.add(30); duplicates are not allowed

		// Printing descending order
		for (int descending : sorting) {
			System.out.println(descending);
		}
	}

}
