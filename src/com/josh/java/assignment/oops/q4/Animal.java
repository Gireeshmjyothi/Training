package com.josh.java.assignment.oops.q4;

public abstract class Animal {
	// instance variable of Animal class
	String name;

	// generating construct to initialize name of Animal
	public Animal(String name) {
		this.name = name;
	}

	public abstract void greets();

}
