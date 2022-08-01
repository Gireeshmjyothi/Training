package com.josh.java.multithreading;

/*
 * ShowRoom class is used to give the items from the warehouse
 */
public class ShowRoom extends Thread {
	WareHouse ref;
	private int noOfItems;

	public ShowRoom(WareHouse ref, int noOfItems) {
		this.ref = ref;
		this.noOfItems = noOfItems;
	}

	@Override
	public void run() {
		ref.purchase(noOfItems);
	}
}
