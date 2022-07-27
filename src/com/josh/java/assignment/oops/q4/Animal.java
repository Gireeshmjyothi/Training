package com.josh.java.assignment.oops.q4;

/*
 * Here abstract class is giving greets method to sub-classes
 */
public abstract class Animal {

	String name;

	/*
	 * generating construct to initialize name of Animal
	 */
	public Animal(String name) {
		this.name = name;
	}

	public abstract void greets();

}
