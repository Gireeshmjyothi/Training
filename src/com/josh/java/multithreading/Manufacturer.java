package com.josh.java.multithreading;

/*
 * Manufacturer class is used to store their items into the warehouse
 */
public class Manufacturer extends Thread {
	WareHouse ref;
	private int noOfItems;

	Manufacturer(WareHouse ref, int noOfItems) {
		this.ref = ref;
		this.noOfItems = noOfItems;
	}

	@Override
	public void run() {
		ref.storing(noOfItems);
	}
}
