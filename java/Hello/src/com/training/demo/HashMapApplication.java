package com.training.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**
         * Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. 
         * If you try to insert the duplicate key, it will replace the element of the corresponding key.
         * It is easy to perform operations using the key index like updation, deletion, etc. 
         * HashMap class is found in the java.util package.
         *  It allows us to store the null elements as well, but there should be only one null key.
         *  Java HashMap maintains no order.
         *  Map -> AbstractMap => HashMap ( => extends, -> implements)
         *  public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable  
         *  It uses a technique called Hashing. It implements the map interface. 
         * 
         * 
         * */
		
		Map<String, Integer> value= new HashMap<>();
		value.put("One", 1);
		value.put("Two", 2);
		value.put("Three", 3);
		
		System.out.println(value);
		
		if(value.isEmpty()!=true) {
			System.out.println("Is not empty.");
		} else {
			System.out.println("Is empty");
		}
		
		System.out.println("size of hashmap=> "+value.size());
		
		if(value.containsKey("Five")) {
			System.out.println("hello from five.");
		} else {
			System.out.println("None 1..");
		}
		
		if(value.containsValue(3)) {
			System.out.println("Hello from three");
		} else {
			System.out.println("None 2.....");
		}
		
		/**
		 *To get the key and value elements, we should call the getKey() and getValue() methods.
		 *The Map.Entry interface contains the getKey() and getValue() methods.
		 **/
		System.out.println("Iterating Hashmap...");  
		for( Map.Entry<String,Integer> m : value.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		}  
		
		Set<String> val= value.keySet();
		System.out.println(val);
		
		Collection<Integer> val1=value.values();
		System.out.println(val1);
		
		value.forEach((k,v) ->{
			System.out.println("K =>"+k+" V=> "+v);
		});
	
	}

}
