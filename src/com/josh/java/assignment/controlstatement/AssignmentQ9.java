package com.josh.java.assignment.controlstatement;

import java.util.Scanner;

class Pattern{
	//Pattern (a)
	public static void pattern_a(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("#"+" ");
			}
			System.out.println();
		}
	}
	//Pattern (b)
	public static void pattern_b(int b) {
		for(int i=1;i<=b;i++) {
			for(int j=b-i;j>=0;j--) {
				System.out.print("#"+" ");
			}
			System.out.println();
		}
	}
	//Pattern (c)
	public static void pattern_c(int c) {
		int space=c-1;
		int hash=c;
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=hash;k<=c;k++) {
					System.out.print("#");
				}
			space--;
			hash--;
			System.out.println();
		}
	}
	//Pattern (d)
	public static void pattern_d(int d) {
		int space=0;
		for(int i=1;i<=d;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=space;k<d;k++) {
					System.out.print("#");
				}
			space++;
			System.out.println();
		}
	}
}
public class AssignmentQ9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		Pattern.pattern_a(size);
		System.out.println("--------------------");
		Pattern.pattern_b(size);
		System.out.println("--------------------");
		Pattern.pattern_c(size);
		System.out.println("--------------------");
		Pattern.pattern_d(size);
		sc.close();
	}

}
