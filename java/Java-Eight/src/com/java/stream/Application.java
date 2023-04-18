package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /**
          * stream by importing java.util.stream package.
          * Stream does not store elements. It simply conveys elements 
            from a source such as a data structure, an array, or an I/O channel, 
            through a pipeline of computational operations.
          * Operations performed on a stream does not modify it's source. For example, 
            filtering a Stream obtained from a collection produces a new Stream without the filtered elements, 
            rather than removing elements from the source collection.
          * You can use stream to filter, collect, print, and convert from one data structure to other etc
          * source->filter->sort->map->collect
          * */
		/**
		Stream<String> stream=Stream.of("a","b","c");
		stream.forEach(System.out::println);
		
		Collection<String> col= Arrays.asList("Java","C","CPP");
		Stream<String> st=col.stream();
		st.forEach(System.out::println);
		
		List<String> ls= Arrays.asList("JavaScript","node","jquery");
		Stream<String> st1=ls.stream();
		st1.forEach(System.out::println); */
		
		/**
		 * java stream provides filter() method to filter stream elements on the basis of given predicate
		 * Method takes predicate as argument and provide returns stream of filtered result element.
		 * 
		 * */
		/**
		List<Product> list=new ArrayList<>();
		for(Product prod: getAllProduct()) {
			if(prod.getPrice()>38000) {
				list.add(prod);
			}
		}
		System.out.println("After filter..");
		for(Product p:list) {
			System.out.println(p);
		}
	    */
	    getAllProduct().stream()
			           .filter((product) -> product.getPrice() > 37000)
			           .forEach(System.out::println);
		
	}
	private static List<Product> getAllProduct(){
		List<Product> product=new ArrayList<>();
		product.add(new Product("HP",1,50000,5));
		product.add(new Product("DELL",9,30000,4));
		product.add(new Product("APPLE",2,70000,2));
		product.add(new Product("LENAVO",6,40000,18));
		
		return product;
	}

}
