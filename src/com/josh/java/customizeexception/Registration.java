package com.josh.java.customizeexception;

import java.util.Scanner;

public class Registration {
	
	String name;
	long mobile;
	int age;
	//Here throws keyword is used to pass the exception without handling it
	public void save(String name,long mobile,int age) throws MobileNumberLengthException,AgeLimitException{
		this.name=name;
		this.mobile=mobile;
		this.age=age;
		String length=""+mobile;
	//Checking for the condition if not then it will generate an object of MobileNumberLengthException
	//	and it can be thrown by using throw keyword
		if(length.length()!=10) {
			MobileNumberLengthException mbl=new MobileNumberLengthException("Required 10 digits");
			throw mbl;
		}
	//Checking for the condition if not then it will generate an object of AgeLimitException
		if(age<18) {
			AgeLimitException ag=new AgeLimitException("Required 18+ age");
			throw ag;
		}
		System.out.println("Data stored");
	}
}

class CompanyRegistration{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name :");
		String name=sc.nextLine();
		
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		
		System.out.println("Enter mobile number :");
		long number=sc.nextLong();
		//Creating an object of Registration class
		Registration rsg=new Registration();
		try {
		//Exception throwing statement
			rsg.save(name, number, age);
		}
		// this is new feature of writing catch block using bitwise 'OR' operator for multiple catches
		catch(MobileNumberLengthException | AgeLimitException a) {
			a.printStackTrace();
		}
		//finally block is always executed irrespective of exception,this is mainly used to close the costly resources
		finally {
			sc.close();
		}
	}
}