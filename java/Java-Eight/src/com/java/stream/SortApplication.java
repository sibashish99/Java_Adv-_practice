package com.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=new ArrayList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("pineapples");
		
		//fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		//lambda exp
		fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).forEach(System.out::println);
		fruits.stream().sorted().forEach(System.out::println);
		
		//desc
		System.out.println("Desc.");
		fruits.stream().sorted((o1,o2) -> o2.compareTo(o1)).forEach(System.out::println);
		//.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		System.out.println("***********************");
		List<Product> product=new ArrayList<>();
		product.add(new Product("HP",1,50000,5));
		product.add(new Product("DELL",9,30000,4));
		product.add(new Product("APPLE",2,70000,2));
		product.add(new Product("LENAVO",6,40000,18));
		
		
		/**product.stream().sorted(new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			return o1.getPrice()-o2.getPrice();
		}}).forEach(System.out::println); */
		   
	   /**product.stream()
	          .sorted((o1,o2) -> (o1.getPrice()-o2.getPrice()))
	          .forEach(System.out::println);*/
	   
		product.stream()
		       .sorted(Comparator.comparingLong(Product:: getPrice))
		       .forEach(System.out::println); 
		
		System.out.println("Reverse...");
		product.stream()
	       .sorted(Comparator.comparingLong(Product:: getPrice).reversed())
	       .forEach(System.out::println);
		
		

	}

}
