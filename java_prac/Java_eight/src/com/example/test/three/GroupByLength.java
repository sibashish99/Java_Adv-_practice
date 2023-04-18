package com.example.test.three;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //write a program to group the words by length using java 8
		List<String> str=Arrays.asList("i","have","a","sentence","with","technical","words");
		Map<Integer,List<String>> result= str.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(result);
	}

}
