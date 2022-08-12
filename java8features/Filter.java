package com.josh.java.java8features;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		  List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        //Here we are filtering the price,fetching price and also iterating
	        productsList.stream()  .filter(p ->p.getPrice()> 30000).forEach(System.out::println); 
	}

}
