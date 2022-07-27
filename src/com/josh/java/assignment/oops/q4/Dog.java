package com.josh.java.assignment.oops.q4;

// Dog class extending(or acquiring properties) Animal class
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void greets() {
		System.out.println("woof");
	}

	public void greets(Dog a) {
		System.out.println("woooof");
	}
}
