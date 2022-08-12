package com.josh.java.java8features;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private int id;
	private String name;
	private float price;
}
