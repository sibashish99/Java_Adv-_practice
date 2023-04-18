package com.training.demo;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /**
      * In Java, an Iterator is one of the Java cursors. 
      * Java Iterator is an interface that is practiced in order to iterate over a collection of Java object components entirety one by one.
      * Total of four methods that are: hasNext() next() remove() forEachRemaining()
      * 
      * */
		ArrayList<String> cityNames = new ArrayList<String>();  
	    
        cityNames.add("Delhi");  
        cityNames.add("Mumbai");  
        cityNames.add("Kolkata");  
        cityNames.add("Chandigarh");  
        cityNames.add("Noida");  
    
        // Iterator to iterate the cityNames  
        Iterator<String> iterator = cityNames.iterator();  
        System.out.println("CityNames elements : ");  
    
        while (iterator.hasNext()) { 
        	System.out.println(iterator.next() + " "); 
        } 
	}

}
