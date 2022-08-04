package com.josh.java.collectionframework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
/*
 * This class provides the details of groceries in the form of name price and
 * quantity
 */
public class GroceriesItems {
	private String itemname;
	private double itemPrice;
	private String Kg;

}
