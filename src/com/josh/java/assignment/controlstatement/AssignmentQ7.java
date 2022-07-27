package com.josh.java.assignment.controlstatement;

import java.util.Scanner;

public class AssignmentQ7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		for(int i=0;i<=size;i++) {
			for(int j=0;j<=size;j++) {
				if(i%2==0)System.out.print("#"+" ");
				else System.out.print(" "+"#");
			}
			System.out.println();
		}
		sc.close();
	}

}
