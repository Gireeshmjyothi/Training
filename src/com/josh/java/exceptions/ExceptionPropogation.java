package com.josh.java.exceptions;

public class ExceptionPropogation {
	
	static void m1(){
		// here we are providing handler for m2 method to terminate our program normally
		try {
			m2();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("m1 method executing");
	}
	static void m2() {
		int num=10;
		int deno=0;
		//error throwing statement,if this error not handled here then it will go who is calling this method
		int dev=num/deno;
		System.out.println(dev);
	}
	
	public static void main(String[] args) {
		//m1 method calling in main method
		m1();
	}
}
