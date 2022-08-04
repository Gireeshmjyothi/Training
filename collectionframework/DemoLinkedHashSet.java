package com.josh.java.collectionframework;

import java.util.LinkedHashSet;

/*
 *This class representing that LinkedHashSet doesn't allow duplicates, null values and 
 *it  follow the insertion order
 */
public class DemoLinkedHashSet {

	public static void main(String[] args) {
		// Creating an empty object of LinkedHashSet
		LinkedHashSet<String> animal = new LinkedHashSet<>();
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
