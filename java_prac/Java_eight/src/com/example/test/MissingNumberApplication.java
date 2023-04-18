package com.example.test;

public class MissingNumberApplication {

	public static void main(String[] args) {
		int test[] = new int[]{1,2,3,4,6,7,8,5,10};
		int sum=(10*11)/2;
		for(int i=0;i<test.length;i++) {
			sum-=test[i];
		}
		System.out.println("Missing numner -> "+sum);

	}

}
