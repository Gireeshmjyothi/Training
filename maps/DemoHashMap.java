package com.josh.java.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * This Demo class is used for stores some data in the form of Key and Values
 * using HashMap 
 */
public class DemoHashMap {

	public static void main(String[] args) {
		// Creating an empty object of HashMap
		HashMap<Integer, String> table = new HashMap<>();
		table.put(1, "Bharat");
		table.put(140, "Subhra");
		table.put(1022, "Sahil");
		table.put(109, "Jeevan");
		table.put(8, "Anirudh");
		table.put(11, "Lohit");
		// Displaying content using entrySet()
		Set set = table.entrySet();
		System.out.println("Printing HashMap-----");
		System.out.println(set);
		// Displaying content using iterator method
		// Iterator<Entry<Integer, String>> iterator = set.iterator();
		/*
		 * while(iterator.hasNext()) { Map.Entry<Integer,String>mentry =
		 * iterator.next(); System.out.print("[key : "+ mentry.getKey() +
		 * ",Value : "+mentry.getValue()+"]"); }
		 */
		// Calling sortingData method to sort the element with help of TreeMap
		DemoTreeMap.sortingData(table);
		// Calling insertion method to maintain insertion order by using LinkedHashMap
		DemoLinkedHashMap.insertionOrder(table);
	}

}
