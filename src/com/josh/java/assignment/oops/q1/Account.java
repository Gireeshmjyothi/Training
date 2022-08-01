package com.josh.java.assignment.oops.q1;

import lombok.Data;

@Data
public class Account {
	// Providing security for Account class data members using private key
	private  String id;
	private String name;
	private int balance;

	/*
	 * Contractor is used to initialize object
	 */
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	/*
	 * credit method is used to add amount to existing balance
	 */
	public void credit(int amount) {
		balance = balance + amount;
	}

	/*
	 * debt it method is used to subtract amount from balance
	 */
	public void debit(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.err.println("Amount exceeded balance");
		}
	}

	/*
	 * transfer amount to the given Account
	 */
	public void transferTo(Account a, int amount) {
		if (amount <= balance) {
			a.balance = a.balance + amount;
			balance -= amount;
		} else {
			System.out.println("Amount exceed balance");
		}
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
