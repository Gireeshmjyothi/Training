package com.josh.java.maps;

import java.util.Arrays;

/*
 * This class is used to sort the string according its length
 */
public class DemoCompare {

	public static void main(String[] args) {
		// Creating string array and passing some random names
		String[] arr = { "Sahil", "RaviKumar", "Anirudh", "Lohit", "Jeevan", "Bharat","Abhi"};
		Arrays.sort(arr, new ComparingLength());
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
