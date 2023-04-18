package com.java.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Employee> emp= new ArrayList<Employee>();
        emp.add(new Employee("Sibashish",14,"8837434508",53700));
        emp.add(new Employee("Ashis",24,"9139163891",145700));
        emp.add(new Employee("Swastik",04,"01392422420",43700));
        emp.add(new Employee("Amit",11,"0483279572",48700));
        emp.add(new Employee("Nitish",98,"39279470",78500));
        
//        Collections.sort(emp,new Comparator<Employee>(){
//
//        	@Override
//        	public int compare(Employee o1, Employee o2) {
//        		// TODO Auto-generated method stub
//        		return (o1.getSalary()-o2.getSalary());
//        	}
//          });
        //Collections.sort(emp, (o1,o2) -> (int)(o1.getSalary()-o2.getSalary()));
        Collections.sort(emp, (o1,o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println(emp);
        
	}

}


