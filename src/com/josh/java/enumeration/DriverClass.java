package com.josh.java.enumeration;

//This class drives multiple classes in it
public class DriverClass {

	public static void main(String[] args) {
		// Creating an object of Pizza class
		Pizza pizza = new Pizza();
		// Here, we passed a small size of pizza
		pizza.orderPizza(Size.SMALL);
		// Here, we passed a large size of pizza
		pizza.orderPizza(Size.LARGE);
	}
}
