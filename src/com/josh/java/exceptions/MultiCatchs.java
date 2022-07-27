package com.josh.java.exceptions;

import java.util.Scanner;

public class MultiCatchs {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator value :");
		int num=sc.nextInt();
		System.out.println("Enter the denominator value :");
		int deno=sc.nextInt();
		int dev=0;
		int[] arr=new int[4];
		try {
			//multiple throwing try block.but it will throw only one exception at a time
			dev=num/deno;
			//arr[5]=dev; if the size of array exceeds then it create an object 
			arr[3]=dev;
		}
		//we have multiple throwing exceptions and they are related to each other then we'll go for multiple catch block
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		System.out.println(dev);
		System.out.println(arr[3]);
		sc.close();
	}
}
