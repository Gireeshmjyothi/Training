package com.josh.java.customizeexception;

@SuppressWarnings("serial")
public class MobileNumberLengthException extends RuntimeException {
	//Creating customize exception of mobile number type
	public MobileNumberLengthException(){
		System.out.println("Number should be 10 Digits");
	}
	public MobileNumberLengthException(String msg) {
		super(msg);
	}
}
 