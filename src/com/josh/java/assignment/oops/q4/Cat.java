package com.josh.java.assignment.oops.q4;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		this.name = name;
	}
	/*
	 * Here the implementation of the 'greets' method is invoked
	 */
	@Override
	public void greets() {
		System.out.println("Meow");
	}
}
