package com.josh.java.multithreading;

/*
 * DiverClass drives the multiple classes in it
 */
public class DriverClass {

	public static void main(String[] args) {
		// Creating an object and giving some items to store
		WareHouse currentitems = new WareHouse(500);
		// Here customer demanding some items
		ShowRoom requireditems = new ShowRoom(currentitems, 700);
		requireditems.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Here add few more items into WareHouse
		Manufacturer addingitems = new Manufacturer(currentitems, 500);
		addingitems.start();
	}
}
