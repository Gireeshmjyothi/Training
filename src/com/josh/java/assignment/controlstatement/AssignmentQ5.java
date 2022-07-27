package com.josh.java.assignment.controlstatement;

import java.util.Scanner;

public class AssignmentQ5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value :");
		int num=sc.nextInt();
		int rem=num%10;
		String st=""+rem;
		num/=10;
		while(num!=0) {
			rem=num%10;
			st=st+" "+rem;
			num/=10;
		}
		System.out.println(st);
		sc.close();
	}

}
