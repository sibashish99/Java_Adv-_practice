package com.example.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getEmloyeeSalary() -o2.getEmloyeeSalary());
	}
}
