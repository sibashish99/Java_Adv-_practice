package com.java.employee;

public class Employee {
   private String name;
   private int id;
   private String number;
   private int salary;
   
   public Employee(String name, int id, String number, int salary) {
	super();
	this.name = name;
	this.id = id;
	this.number = number;
	this.salary = salary;
  }

  public Employee() {
	super();
	// TODO Auto-generated constructor stub
   }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 public int getId() {
	return id;
 }

 public void setId(int id) {
	this.id = id;
 }

 public String getNumber() {
	return number;
 }

 public void setNumber(String number) {
	this.number = number;
 }

 public int getSalary() {
	return salary;
 }

 public void setSalary(int salary) {
	this.salary = salary;
 }

  @Override
 public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", number=" + number + ", salary=" + salary + "]";
 }
   
   
   
}
