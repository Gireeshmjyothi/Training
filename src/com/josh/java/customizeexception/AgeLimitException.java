package com.josh.java.customizeexception;

@SuppressWarnings("serial")
public class AgeLimitException extends RuntimeException{
	//Creating customize exception of age limit type
		public AgeLimitException() {
			System.out.println(" For registration age should be greater than 18 ");
		}
		public AgeLimitException(String msg) {
			super(msg);
		}
}
