package com.josh.java.java8features;

import java.util.Optional;

/*
 * Optional class mainly used to avoid the java.lang.NullPointerExcetion
 * OptionalDemo class is defined to show the example of Optional class of java 8
 */
public class OptionalDemo {

	public static void main(String[] args) {

		String[] arr = new String[5];
		arr[0] = "anirudh";
		arr[1] = "jeevan";
		System.out.println(arr[0].toUpperCase());
		// java.lang.NullPointerException
		// System.out.println(arr[2].toUpperCase());
		Optional<String> stringone = Optional.ofNullable(arr[1]);
		System.out.println(stringone.isPresent());
		Optional<String> stringtwo = Optional.ofNullable(arr[2]);

		if (stringtwo.isPresent()) {
			System.out.println(stringtwo.get() + "To uppercase :" + stringtwo.get().toUpperCase());
		} else {
			System.out.println(stringtwo.orElse("Bharat"));
		}

	}

}
