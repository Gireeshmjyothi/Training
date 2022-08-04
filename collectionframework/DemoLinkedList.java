package com.josh.java.collectionframework;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		// Creating an empty object list of groceries items
		List<GroceriesItems> listOfItems = new LinkedList<>();
		listOfItems.add(new GroceriesItems("Rice", 45, "1Kg"));
		listOfItems.add(new GroceriesItems("Wheat", 35, "1Kg"));
		listOfItems.add(new GroceriesItems("Peanut", 95, "1Kg"));
		listOfItems.add(new GroceriesItems("Peanut", 95, "1Kg"));
		listOfItems.add(new GroceriesItems("Salt", 10, "1Kg"));
		// remove() method is used to remove the items by passing object
		listOfItems.remove(new GroceriesItems("Peanut", 95, "1Kg"));
		// remove() method is used to remove the items by passing index
		listOfItems.remove(2);
		// Printing statement
		for (Object groceries : listOfItems) {
			System.out.println(groceries);
		}
	}

}
