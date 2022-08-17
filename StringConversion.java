package com.josh.java.conversion;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.josh.java.filehandling.InputStream;

public class StringConversion {

	public static void main(String[] args) {

		// ASCII to String
		int[] asciiNum = { 65, 97, 66, 98, 67, 99 };
		for (int i : asciiNum) {
			System.out.print(Character.toString((char) i) + " ");
		}

		// Writer to String
		StringWriter sw = new StringWriter();
		sw.append("\nAnirudh");
		sw.append(" Naik");
		String str = sw.toString();
		System.out.println(str);

		// Stacktrace to String
		try {
			int a[] = new int[3];
			System.out.println("Printing element at index four:" + a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			StringWriter stringwriter = new StringWriter();
			e.printStackTrace(new PrintWriter(stringwriter));

			String printExceptionAsString = stringwriter.toString();
			System.out.println(printExceptionAsString);
		}

		// String to ArrayList
		String name = "Anirudh,Jeevan,Subhra,Bharat,Sharada,Lohit";
		String[] arr = name.split(",");
		List<String> list = Arrays.asList(arr);
		list.forEach(print -> System.out.println(print));

		// StringBuffere to String
		StringBuffer stringbuff = new StringBuffer("StringBuffere to String");
		System.out.println("String contains = " + stringbuff.toString());

		// Inputstream to String
		try {
			// Creating an InputStream object
			java.io.InputStream is = new FileInputStream("D:\\data\\book.txt");

			// creating an InputStreamReader object
			InputStreamReader isr = new InputStreamReader(is);

			// Creating a BufferedReader object
			BufferedReader br = new BufferedReader(isr);
			StringBuffer sb = new StringBuffer();
			String input = null;
			while ((str = br.readLine()) != null) {
				sb.append(input);
			}
			System.out.println(sb.toString());
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
