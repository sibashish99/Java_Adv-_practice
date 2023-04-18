package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Addable addition = (a, b) -> (a+b);
        int res= addition.addidtion(10, 40);
        System.out.println(res);
	}

}
