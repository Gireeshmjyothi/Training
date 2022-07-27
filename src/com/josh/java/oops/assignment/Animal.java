package com.josh.java.oops.assignment;

public abstract class Animal {
	//instance variable of Animal class
	String name;
	//generating construct to initialize name of Animal
	public Animal(String name) {
		this.name = name;
	}
	public abstract void greets();

}
// Cat class extending Animal class
class Cat extends Animal {

	public Cat(String name) {
		//using super key we passing name to the Animal class parameterized construct
		super(name);
		this.name = name;
	}
//here overriding abstract class method greets();
	@Override
	public void greets() {
		System.out.println("Meow");
	}
}

// Dog class extending(or acquiring properties) Animal class
class Dog extends Animal {

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

class BigDog extends Dog {

	public BigDog(String name) {
		super(name);
	}

	public void greets() {
		System.out.println("Wooow");
	}
//here passing Dog type reference
	public void greets(Dog a) {
		System.out.println("Woooooow");
	}
// here passing BigDog type reference 
	public void greets(BigDog a) {
		System.out.println("Woooooooooow");
	}
}
