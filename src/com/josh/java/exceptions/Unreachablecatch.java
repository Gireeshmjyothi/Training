package com.josh.java.exceptions;

import java.util.Scanner;

public class Unreachablecatch {

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
		//Generalized handler this will handle all kind of exceptions
		catch(Exception e) {
			e.printStackTrace();
		}
		/*These two catch block will not reach due to default handler exception it will through an error
		 * called unreachable catch block
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}*/
		System.out.println(dev);
		System.out.println(arr[3]);
		sc.close();
		 
	}

}
