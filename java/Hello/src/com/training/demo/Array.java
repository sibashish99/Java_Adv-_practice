package com.training.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello sibashish!");
        /**
          Java Collection framework provides many interfaces (Set, List, Queue, Deque) 
          and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
          Collection is the root interface in collection hierarchy extends iterable<E>
         * */
        /**
         * ArrayList =>
         * Java ArrayList class uses a dynamic array for storing the elements.
         * It is like an array, but there is no size limit. We can add or remove elements anytime. 
         * Java ArrayList class can contain duplicate elements.
         * Java ArrayList class maintains insertion order.
         * 
         * */
        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("coconuts");
        
        System.out.println(fruits);
        
        boolean res= fruits.contains("apple");
        System.out.println(res);
        
        int size=fruits.size();
        System.out.println(size);
        
        fruits.add("apple");
        fruits.remove(1);
        
        System.out.println(fruits);
        
        Iterator itr=fruits.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());
        }  
        
        System.out.println("Lembda exp");
        
        fruits.forEach((ele)->{
        	System.out.println(ele);
        });
	}

}
