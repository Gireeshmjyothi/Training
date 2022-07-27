package assignment;

import java.util.Scanner;

public class Assignment_Q8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Integer Number :");
		int num=sc.nextInt();
		//printing multiple table using nested for loop 
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print((i*j)+"\t");
			}
			System.out.println();
			sc.close();
		}
	}

}
