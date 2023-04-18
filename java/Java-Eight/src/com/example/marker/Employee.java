package com.example.marker;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empid;    
	String empname;    
	public Employee(int empid, String empname){    
	  this.empid = empid;    
	  this.empname = empname;    
	}    
}
