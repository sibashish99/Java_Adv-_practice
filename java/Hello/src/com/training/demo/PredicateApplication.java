package com.training.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class PredicateApplication implements Predicate<Integer> {
public class PredicateApplication {

	/**@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		if(t%2==0) {
			return true;
		}
		return false;
	}*/
	
	public static void main(String[] args) {
		
		/**
		 * A predicate is a function that receives a value and evaluates it.
		 *It has a method test(T obj) to evaluate and return a Boolean value.
		 *It also has some default Methods
		 * */
		
		
		/**Predicate<Integer> p =new PredicateApplication();
		System.out.println(p.test(101));*/
		
		Predicate<Integer> p = (t) -> {
			if(t%2==0) {
				return true;
			}
			return false;
		};
		System.out.println(p.test(103));
		
		List<Integer> list1=Arrays.asList(1,3,4,7,8,11,13);
		list1.stream().filter(t ->t%2!=0).forEach((t) ->{
			System.out.println("print "+t);
		});
		
		
		
		
	}

	


}
