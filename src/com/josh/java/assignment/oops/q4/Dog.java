package com.josh.java.assignment.oops.q4;


public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void greets() {
		System.out.println("woof");
	}

	/*
	 * this is the specific method of Dog class
	 */
	public void greets(Dog a) {
		System.out.println("woooof");
	}
}
