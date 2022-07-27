package com.josh.java.assignment.oops.driver;

import java.util.Scanner;

import com.josh.java.assignment.oops.q1.Account;
import com.josh.java.assignment.oops.q4.Animal;
import com.josh.java.assignment.oops.q4.BigDog;
import com.josh.java.assignment.oops.q4.Cat;
import com.josh.java.assignment.oops.q4.Dog;

/*
 * This Driver class which will execute multiple classes.
 */
public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Account Class \nPress 2 for Animal Class");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			// Creating a new account with some balance
			Account account1 = new Account("642", "Jeevan", 9000);

			// here we are adding some amount to the created account
			account1.credit(1000);
			System.out.println(account1.toString());
			/*
			 * here we are creating another account and passing the arguments
			 */
			Account account2 = new Account("647", "Subhra");
			// before passing amount to the account
			System.out.println(account2.toString());
			// here amount transferring to account1 to account2
			account1.transferTo(account2, 5000);

			// Displaying both the account details here
			System.out.println(account1.toString());
			System.out.println(account2.toString());
			break;
		case 2:

			// Creating an object of Cat class and referring to Animal class(Up-casting)
			Animal cat = new Cat("Luna");
			cat.greets();

			// Creating an object of Dog class and referring to Animal class
			Animal dog = new Dog("Charlie");
			dog.greets();

			// here doing down-casting to Dog type to access specific properties of Dog
			Dog d = (Dog) dog;
			d.greets(d);

			Animal bigdog = new BigDog("Loki");
			bigdog.greets();

			// Down-casting to BigDog type to access specific properties of BigDog class
			BigDog bg = (BigDog) bigdog; 
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
