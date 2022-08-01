package com.josh.java.enumeration;

public class Pizza {
	Size pizzaSize;

	/*
	 * orderPizza() method gives us different size of pizza here we are using switch
	 * cases to achieve this
	 */
	public void orderPizza(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza");
			break;
		case LARGE:
			System.out.println("I ordered a large size pizza");
			break;
		case EXTRALARGE:
			System.out.println("I ordered a Extralarge size pizza");
			break;
		default: {
			System.out.println("Invalid size");
		}
		}
	}
}
