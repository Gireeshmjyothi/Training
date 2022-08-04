package com.josh.java.maps;

import java.util.Hashtable;
import java.util.Map;

/*
 * This class is used to stores the random data into the HashTable
 * in the form of key and values
 */
public class DemoHashTable {

	public static void main(String[] args) {
		// Creating an empty object to store the data into the HashTable
		Hashtable<Integer, String> stdData = new Hashtable<Integer, String>();
		stdData.put(102, "Ravi");
		stdData.put(101, "Vijay");
		stdData.put(103, "Rahul");
		// size() method will give the entry size    
		System.out.println(stdData.size());
		// Printing statement
		for (Map.Entry getData : stdData.entrySet()) {
			System.out.println(getData.getKey() + " " + getData.getValue());
		}
	}

}
