package com.josh.java.maps;

import java.util.Comparator;

/*
 * This class is mainly used to compare the string length and it return accordingly
 */
public class ComparingLength implements Comparator<Object> {
	/*
	 * this method is used to compare two object if object obj1 is greater than obj2
	 * then it will return positive value,if object obj2 greater than obj1 then it
	 * return negative value, if both same then it return zero
	 */
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return s1.length() - s2.length();
	}
}
