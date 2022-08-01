package com.josh.java.assignment.oops.q4;

public class BigDog extends Dog {

	public BigDog(String name) {
		super(name);
	}

	@Override
	public void greets() {
		System.out.println("Wooow");
	}

	/*
	 * here passing Dog type reference
	 */
	public void greets(Dog a) {
		System.out.println("Woooooow");
	}

	/*
	 * this is the specific method of Dog class
	 */
	public void greets(BigDog a) {
		System.out.println("Woooooooooow");
	}
}
