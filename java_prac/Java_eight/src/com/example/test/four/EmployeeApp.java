package com.example.test.four;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeApp {

	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<Employee>();
        Employee e1= new Employee("Sibashish",23,47650);
        Employee e2= new Employee("Ashwin",37,87150);
        Employee e3= new Employee("Rana",33,61950);
        Employee e4= new Employee("Ashwin",21,37150);
        Employee e5= new Employee("Rana",28,41950);
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        System.out.println(employees);
        
        List<Employee> increamentSalary = employees.stream().map(e -> {
        	if(e.getAge()>25) {
        		e.setSalary(e.getSalary() * 1.10);
        	}
        	return e;
        }).collect(Collectors.toList());
        
        System.out.println(increamentSalary);
        
	}

}
