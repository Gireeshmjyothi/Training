package com.josh.java.java8features;
/*
 * Bank is a service provider interface which will give different bank account access 
 * for different interest on home loan
 */
public interface Bank {
	void createNewAccount();

	default void iciciBank() {
		System.out.println("ICICI bank giving 10% interesthome loan");
	}

	default void hdfcBank() {
		System.out.println("HDFC bank giving 8% interest on Home loan");
	}

	default void sbiBank() {
		System.out.println("SBI gving 6% interest on Home loan");
	}
}
