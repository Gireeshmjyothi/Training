package com.josh.java.collectionframework;

import java.util.HashSet;

/*
 *This class representing that HashSet doesn't allow duplicates, null values and also
 *it doesn't follow the insertion order
 */
public class DemoHashSet {

	public static void main(String[] args) {
		// Creating an empty object of HashSet
		HashSet<String> animal = new HashSet<>();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Tiger");
		animal.add("Wolf");
		animal.add("Elephant");
		// Printing animal data
		for (String animaltype : animal) {
			System.out.println(animaltype);
		}
	}

}
