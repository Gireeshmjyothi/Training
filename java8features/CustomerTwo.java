package com.josh.java.java8features;

public class CustomerTwo implements Bank {
	@Override
	public void createNewAccount() {
		System.out.println("Adding Addhar card for new registration");
		System.out.println("Adding Pan card for new registration");
	}
}
