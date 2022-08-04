package com.josh.java.collectionframework;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
/*
 * This class is used to print the numbers in descending order by implementing
 * Comparator interface
 */
public class DemoComparator implements Comparator<Object> {
	/*
	 * compare() method compare the first inserted value and second inserted object
	 * value then return according to the values if first value is greater than
	 * second value return +ve and vice versa
	 */
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer id1 = (Integer) obj1;
		Integer id2 = (Integer) obj2;
		return -id1.compareTo(id2);
	}

}
