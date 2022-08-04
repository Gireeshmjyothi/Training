package com.josh.java.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * This class give the insertion order 
 */
public class DemoLinkedHashMap {

	public static void insertionOrder(Map<Integer, String> map) {
		// Creating an object of LinkedHashMap and storing the data in key and values
		// form
		Map<Integer, String> values = new LinkedHashMap<>();
		values.putAll(map);
		// Printing statement
		Set<Entry<Integer, String>> set = values.entrySet();
		System.out.println("Printing LinkedHashMap-----");
		System.out.println(set);
	}
}
