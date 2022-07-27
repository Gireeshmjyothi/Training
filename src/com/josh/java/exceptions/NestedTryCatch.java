package com.josh.java.exceptions;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numrator value :");
		int num=sc.nextInt();
		System.out.println("Enter the denominator value :");
		int deno=sc.nextInt();
		int dev=0;
		//Nested try catch blocks
		try {
			//Exception throwing statements
			dev=num/deno;// if the value of denominator is zero then it create an object 
		}
		catch(ArithmeticException e) {
			//here we giving one more chance to the user to enter values using nested try catch block
			System.err.println("Denominator won't be 0");
			System.out.println("Enter greater than 0");
			deno=sc.nextInt();
			try {
			//Exception throwing statements
				dev=num/deno;
			}
			catch(ArithmeticException a) {
				a.printStackTrace();
			}
		}
		System.out.println(num+"/"+deno+"="+dev);
		sc.close();
	}

}
