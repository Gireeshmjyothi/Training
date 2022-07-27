package assignment;

import java.util.Scanner;

public class Assignment_Q4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//User Inputs
		System.out.println("Enter the start point");
		int start=sc.nextInt();
		System.out.println("Enter the end point");
		int end=sc.nextInt();
		//here  we use while and if else statements to complete the given puzzle
		while(start<=end) {
			String st="";
			if(start%3==0) st="Coza";
			if(start%5==0) st+="Loza";
			if(start%7==0) st+="Woza";
			if(st.length()==0) System.out.print(start+" ");
			else System.out.print(st+" ");
			if(start%11==0) System.out.println();//this condition is used to print next line at every 11th value
			start++;
		}
		sc.close();
	}

}
