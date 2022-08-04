package com.josh.java.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// Created ArrayList to insert employee
		List<String> empName = new ArrayList<>();
		// Adding multiple data into single object
		empName.add("Anirudh");
		empName.add("Bharat");
		empName.add("Sahil");
		empName.add("Harshita");
		empName.add("Jeevan");
		empName.add("Karthik");
		// Inserting in between existing ArrayList object
		empName.add(2, "Lohit");
		// Creating one more object over here
		List<String> teamName = new ArrayList<>();
		// Here we are adding entire empName data type data into teamName using addall()
		// method
		teamName.addAll(empName);
		// Printing statement
		System.out.println(teamName);
		// To print object type data we used iterator() method over
		System.out.println("----Using iterator() method----");
		Iterator<String> er = teamName.iterator();
		while (er.hasNext()) {
			System.out.println(er.next());
		}
		// Remove random value from the ArrayList
		empName.remove(3);
		// Printing statement using forEach loop
		System.out.println("----Using forEach loop----");
		for (String name : empName) {
			System.out.println(name);
		}
	}

}
