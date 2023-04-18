package com.java.training;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /**
           * The Lambda expression is used to provide the implementation 
                          of an interface which has functional interface.
           * An interface which has only one abstract method is called functional interface.
           * Java provides an anotation @FunctionalInterface, 
             which is used to declare an interface as functional interface.               
           * (argument-list) -> {body}  
           * */
		
       	Shape rectangle = () -> System.out.println("This is from ractangle.");
       	rectangle.draw();
       
       	print(rectangle);
       	
		   
		
	}
	private static void print(Shape shape) {
		/**
		 * lambda exp as method parameter.
		 * */
		shape.draw();
	}

}
