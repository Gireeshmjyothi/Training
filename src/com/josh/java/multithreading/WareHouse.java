package com.josh.java.multithreading;

/*
 * WareHouse class is used to perform some specific operation,
 * like storing the items and selling the items to the customer
 */
public class WareHouse {
	private int noOfProduct;

	public WareHouse(int noOfProduct) {
		this.noOfProduct = noOfProduct;
	}

	/*
	 * storing() method is used to store the items into the warehouse The
	 * synchronized keyword is used for exclusive accessing notify() wakes up the
	 * first thread that called wait() on the same object
	 */
	synchronized public void storing(int items) {
		noOfProduct += items;
		System.out.println("No of product stored :" + items + "\nNo of product left :" + noOfProduct);
		notify();
	}

	/*
	 * purchase() method is to purchase the items from the warehouse if the items
	 * are not resent the it will throw out of stock wait() method is used to give
	 * delay by releasing lock on object
	 */
	synchronized public void purchase(int items) {
		while (items > noOfProduct) {
			System.out.println("Out of stock");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		noOfProduct -= items;
		System.out.println("No of itmes purchased :" + items + "\nNo of product left :" + noOfProduct);
	}
}
