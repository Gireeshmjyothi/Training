package com.josh.java.exceptions;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numrator value :");
		int num=sc.nextInt();// user may enter invalid input like instead of integer s they may enter string like 'Ten'
		System.out.println("Enter the denominator value :");
		int deno=sc.nextInt();//here also the same
		int dev=0;
		
		//Single try catch block 
		try {
			//Exception throwing statements
			dev=num/deno;// if the value of denominator is zero then it create an object 
		}
		catch(ArithmeticException e) {
			//Programmer defined statements
			System.err.println("Denominator can't be zero");
		}
		System.out.println(num+"/"+deno+"="+dev);
		sc.close();
	}

}
