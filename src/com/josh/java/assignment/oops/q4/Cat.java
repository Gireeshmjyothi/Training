package com.josh.java.assignment.oops.q4;

// Cat class extending Animal class
public class Cat extends Animal {

	public Cat(String name) {
		// using super key we passing name to the Animal class parameterized construct
		super(name);
		this.name = name;
	}

	// here overriding abstract class method greets();
	@Override
	public void greets() {
		System.out.println("Meow");
	}
}
