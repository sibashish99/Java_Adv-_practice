package com.training.demo;

import java.util.function.Supplier;

//public class SupplierApplication implements Supplier<String> {
public class SupplierApplication{
	/**@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hello Sibashish";
	}*/
	public static void main(String[] args) {
		/**Supplier<String> sp1= new SupplierApplication();
		System.out.println( sp1.get());*/
		
		Supplier<String> sp1= () ->{
			return "Hello Sibashish";
		};
		System.out.println( sp1.get());
		
		
	}

}
