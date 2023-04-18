package com.example.test.six;


import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCharApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter string");
         String s=sc.next();
         
         HashSet<Character> charSet= new HashSet<>();
         
         for (char c: s.toCharArray()) {
        	 if(charSet.contains(c)) {
        		 System.out.print(c+" ");
        	 }else {
        		 charSet.add(c);
        	 }
         }
	}

}
