package com.training.demo;

import java.util.ArrayList;
import java.util.Collections;

public class CompatarorComparableApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Comparable provides a single sorting sequence. In other words, 
		 * we can sort the collection on the basis of a single element such as id, name, and price.
		 * Comparable is present in java.lang package.
		 * Comparable type by Collections.sort(List) method.
		 * 
		 * 
		 * 
		 * The Comparator provides multiple sorting sequences. In other words, 
		 * we can sort the collection on the basis of multiple elements such as id, name, and price etc.
		 * A Comparator is present in the java.util package.
		 * Collections.sort(List, Comparator) method.
		 * */
       ArrayList<Emp> emps= new ArrayList<>();
       emps.add(new Emp("Sibashish",71,"8837434508"));
       emps.add(new Emp("Debashish",22,"8837434505"));
       emps.add(new Emp("Subashish",13,"8837434528"));
       emps.add(new Emp("kala",44,"8437734008"));
       
       emps.forEach((emp)->{
        System.out.println(emp);
       });
       System.out.println("Sorted id wise");
       Collections.sort(emps,new IdComparator());
       emps.forEach((emp)->{
           System.out.println(emp);
       });
       
       
       System.out.println("Sorted name wise");
       ArrayList<Emp> emps1=new ArrayList<>(emps);
       Collections.sort(emps1,new nameComparator());
       emps1.forEach((emp)->{
           System.out.println(emp);
       });
       
	}

}
