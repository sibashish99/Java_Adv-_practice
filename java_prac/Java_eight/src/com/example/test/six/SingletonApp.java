package com.example.test.six;

public class SingletonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton class1=  Singleton.getInstance();
		Singleton class2=  Singleton.getInstance();
		
		if(class1==class2) {
			System.out.println("Both are same..");
		} else {
			System.out.println("Both are not same..");
		}
	}

}
