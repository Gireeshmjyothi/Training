package com.josh.java.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * This demo class is used to stores the data in form of ascending order using TreeMap
 */
public class DemoTreeMap {

	public static void sortingData(Map<Integer, String> map) {
		// Creating an empty object to employee type data in to TreeMap
		Map<Integer, String> empData = new TreeMap<>();

		empData.putAll(map);
		// clear method will clear all the data
		// empData.clear();

		// Printing statement
		Set<Entry<Integer, String>> set = empData.entrySet();
		System.out.println("Printing TreeMap-----");
		System.out.println(set);
	}

}
