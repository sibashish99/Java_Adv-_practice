package com.training.demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Employee> employees= new ArrayList<Employee>();
       employees.add(new Employee(1,"Sibashish",46512,23));
       employees.add(new Employee(2,"Ashish",85000,67));
       employees.add(new Employee(3,"Anandita",35000,25));
       
       /**Collections.sort(employees,new MySort());
       System.out.println(employees);*/
       
       System.out.println("Asc.......");
       Collections.sort(employees,new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getSalary() - o2.getSalary());
		} 
       });
       System.out.println(employees);
       
      
       System.out.println("Desc...");
       /*
        * Lambda Expressions
        * numbers.forEach( (n) -> { System.out.println(n); } );
        */
       Collections.sort(employees, (o1,o2) -> (int)(o2.getSalary() - o1.getSalary()) );
       System.out.println(employees);
	}

}
class MySort implements Comparator<Employee>{

	/*
	 * public void sort(List list, Comparator c): is used to sort the elements of List by the given Comparator.
	 * This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
	 * */
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary() - o2.getSalary());
	}
	
	
}

//1:45:56
