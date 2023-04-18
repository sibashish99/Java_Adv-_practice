package com.training.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /**
        * An interface with only one method.
        *  @FunctionalInterface
           Used to enforce the intent of the interface
        *   Existing interfaces are annotated with @FunctionalInterface
        *   Adding another method to the interface definition, will not be functional
            and compilation process will fail.
            
        *Existing functional interfaces : Comparator, Callable , Runnable, ActionListener
        *java.util.function: Consumer, Supplier, Function and Predicate.
        *
        *– Predicate<T>
         – Consumer<T>
         – Function<T, R>
         – Supplier<T>
        *Where T and R represent generic types
        – T represents a parameter type
        – R the return type.
        *
        */
		
		
		
		
		
		/**
		 * Supplier<T>:
		 * Represents a supplier of results.
		 * It does not take any arguments.
		 * Used for lazy generation of values
		 *Returns newly generated values, T, in the stream.
		 * */
		
		
		/**
		 * Consumer<T>
		 * Represents an operation that accepts a single input and returns no result
		 * It has one Method void accept(T t)
		 * Performs operation on the given argument (T t)
		 * */
		Consumer<Integer> consumer = (t) ->{
			System.out.println("printing "+t);
		};
		consumer.accept(1000);
		
		List<Integer> list1=Arrays.asList(1,3,4,7,8,11,13);
		list1.stream().forEach((t) ->{
			System.out.println("print "+t);
		});
		
		
		
		
		
		/**
		 * Function<T,R>
		 * Represents a function that accepts one argument and produces a result.
		 * R apply(T t) 
		 * */
		
		
		
	}

}
