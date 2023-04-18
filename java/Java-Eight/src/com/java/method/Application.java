package com.java.method;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}
public class Application {
	
	public void Print(String msg) {
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
	
	public static int addition(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /**
          * Method reference is used to refer method of functional interface.
          * Each time when you are using lambda expression to just referring a method, 
            you can replace your lambda expression with method reference. 
          * There are following types of method references in java:
             Reference to a static method:- class::staticMethodName
             Reference to an instance of a object :- object::instanceMethodName
             Reference to a constructor:- className::new
          * 
          * */
		
		Function<Integer, Double> function= (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));
		

		// Reference to a static method
		Function<Integer, Double> functionRef = Math::sqrt;
		System.out.println(functionRef.apply(9));
		
		BiFunction<Integer, Integer, Integer> biFun= (a,b) -> Application.addition(a, b);
		System.out.println(biFun.apply(10, 190));
		
		// Reference to a static method
		BiFunction<Integer, Integer, Integer> biFunc=  Application::addition;
		System.out.println(biFunc.apply(10, 190));
		
		
		
		Application app= new Application();
		Printable printable= (msg) -> app.Print(msg);
		printable.print("hElLO WORLD");
		
		// Reference to an instance of a object
		Printable printables = app::Print;
		printables.print("heLLO WORLD");
		
		/**
		 * refernece to a instance method of an arbitrary object of specific type
		 * class::instanceMethodName
		 * sometimes we call method arg in lambda exp in such case we can use method 
		   refernece to call an instance.
		 * 
		 * */
		Function<String, String> stringFun= (String str) -> str.toLowerCase();
		System.out.println(stringFun.apply("HeLLO WORLD"));
		
		//USING method ref
		Function<String, String> stringMethodRef= String::toLowerCase;
		System.out.println(stringFun.apply("HeLLO WORLD"));
		
		/** 
		 * BiFunction is a functional interface, It can be used as an assignment 
		 target for a lambda expression or method reference.
		 It belongs to java.util.function package.

		@FunctionalInterface  
		public interface BiFunction<T,U,R>  
		The interface has the following two methods: apply() , andThen()
		
		*/
		BiFunction <Integer, Integer, Integer> add = (x, y) -> x + y;  
		System.out.println("The sum of x and y is: " + add.apply(12, 23));
		
		
		BiFunction<Integer, Integer, Integer> f1 = (a, b) -> a + b;  
		System.out.println(f1.apply(34, 12));  
		Function<Integer, Integer> f2 = a -> a * a;  
		System.out.println(f1.andThen(f2).apply(11, 13));
		
		Map<Integer, String> map = new HashMap<>();    
		map.put(1, "Olivia");  
		map.put(2, "Noah");  
		map.put(3, "John");  
		map.put(4, "Alex");  
		map.put(5, "Emma");  
		map.put(6, "Amelia");  
		map.put(7, "Noah");  
		
		BiFunction<Integer, String, String> f = (key, value) -> "[Key="+key+", "+value+"("+Collections.frequency(map.values(), value)+")]";    
		map.forEach((k,v)-> System.out.println(f.apply(k, v)));  
		
		
		
		
		
		
		
		
		
		
	}

}
