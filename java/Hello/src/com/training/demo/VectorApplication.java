package com.training.demo;

import java.util.*;

public class VectorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /**
           * Vector is like the dynamic array which can grow or shrink its size. 
           * Unlike array, we can store n-number of elements in it as there is no size limit.
           * It is found in the java.util package and implements the List interface, so we can use all the methods of List interface here.
           * */
		 Vector<String> vecArr=new Vector<String>();
		 //add()
		 vecArr.add("Sibashish");
		 vecArr.add("Ashish");
		 vecArr.add("Sibashish1");
		 vecArr.add("Ashish1");
		 System.out.println(vecArr);
		 
		 //addElement()
		 vecArr.addElement("Debashsih");
		 System.out.println(vecArr);
		 
		 //size()
		 System.out.println("Size of vector Array is:"+vecArr.size());
		 
		 //capacity()
		 System.out.println("Size of vector Array is:"+vecArr.capacity());

		 
		 //contains()
		 System.out.println("If containe Swapna: "+ vecArr.contains("Swapna"));
		 
		 //removeElementAt()
		 vecArr.removeElementAt(3);
		 System.out.println("After removing element @3"+vecArr);
		 
		 //remove()
		 vecArr.remove(0);
		 System.out.println("After removing element @0"+vecArr);
		 
		 
		 //forEach()
		 System.out.println("ForEach");
		 vecArr.forEach((element)->{
		   System.out.println(element);
		 });
		 
		 
		 
		 
		
		
		
		
	}

}
