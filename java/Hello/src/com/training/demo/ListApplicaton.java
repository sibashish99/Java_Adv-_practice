package com.training.demo;

import java.util.*;

public class ListApplicaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**
         * List in Java provides the facility to maintain the ordered collection.
         * It contains the index-based methods to insert, update, delete and search the elements. 
         * It can have the duplicate elements also. 
         * We can also store the null elements in the list.
         * The implementation classes of List interface are ArrayList, LinkedList, Stack and Vector.
         * */
		List<String> ls= new ArrayList<String>();
		ls.add("ele1");
		ls.add("ele2");
		ls.add("ele3");
		
		System.out.println(ls);
		
		ls.add(null);
		System.out.println("ls....");
		System.out.println(ls);
		
		System.out.println(ls.get(1));
		
		System.out.println("Ls1.....");
		List<String> ls1= new ArrayList<>(ls);
		List<String> ls2= new ArrayList<>();
		
	    ls2.add("ele4");
	    ls1.addAll(ls2);
	    System.out.println("ls2......");
	    System.out.println(ls1);
		
	    System.out.println("accessing element");
	    //isEmpty()
	    System.out.println(ls.isEmpty());
	    //size()
	    System.out.println(ls2.size());
	    //get()
	    System.out.println(ls1.get(4));
	    //set()
	    System.out.println(ls1.set(1, null));
	    System.out.println(ls1);
	    
	    System.out.println("remove element..");
	    ls1.remove(1);
	    System.out.println(ls1);
	    
	    /**
	    ls1.removeAll(ls1);
	    System.out.println(ls1);
	    */
	    System.out.println("Iteration.......");
	    for(int i=0;i<ls1.size();i++) {
	    	System.out.println(ls1.get(i));
	    }
	    
	    System.out.println("For each loop");
	    for(String l: ls1) {
	    	System.out.println(l);
	    }
	    
	    for (Iterator iterator = ls2.iterator(); iterator.hasNext();) {
			String ls11 = (String) iterator.next();
			System.out.println(ls11);
		}
		
	    System.out.println("lambda exp..");
	    ls1.stream().forEach(l -> System.out.println(l));
	    
	    List<String> language= new ArrayList<>();
	    language.add("C");
	    language.add("Java");
	    language.add("JS");
	    language.add("Cpp");
	    language.add("C#");
	    language.add("Shell");
	    
	    System.out.println(language);
	    System.out.println("Sorting arraylist..");
	    Collections.sort(language);
	    System.out.println(language);
	}

}
