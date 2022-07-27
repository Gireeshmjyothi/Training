package com.josh.java.oops.assignment;

import java.util.Scanner;

//This Driver class which will execute multiple classes.
public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Account Class \nPress 2 for Animal Class");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			Account account1 = new Account("642", "Jeevan", 9000);// Creating a new account with some balance

			account1.credit(1000);// here we are adding some amount to the created account
			System.out.println(account1.toString());
			Account account2 = new Account("647", "Subhra");
			System.out.println(account2.toString());// before passing amount to the account
			account1.transferTo(account2, 5000); // here amount transferring to account1 to account2

			// Priting both the account details here
			System.out.println(account1.toString());
			System.out.println(account2.toString());
			break;
		case 2:

			Animal cat = new Cat("Luna");// Creating an object of Cat class and referring to Animal class(Up-casting)
			cat.greets();

			Animal dog = new Dog("Charlie");// Creating an object of Dog class and referring to Animal class
			dog.greets();

			Dog d = (Dog) dog;// here doing down-casting to Dog type to access specific properties of Dog
								// class
			d.greets(d);

			Animal bigdog = new BigDog("Loki");
			bigdog.greets();

			BigDog bg = (BigDog) bigdog; // Down-casting to BigDog type to access specific properties of BigDog class
			bg.greets(d);
			bg.greets(bg);
			break;

		default: {
			System.out.println("invalid Input");
		}
		}
		sc.close();
	}

}
