package com.training.demo;

import java.util.Comparator;

public class nameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
  
}
