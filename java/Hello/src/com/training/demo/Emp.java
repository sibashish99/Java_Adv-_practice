package com.training.demo;

//public class Emp implements Comparable<Emp>{
public class Emp{
   private String name;
   private int id;
   private String phone;
  
   public Emp() {
	 super();
	 // TODO Auto-generated constructor stub
    }

   public Emp(String name, int id, String phone) {
	super();
	this.name = name;
	this.id = id;
	this.phone = phone;
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

 public String getPhone() {
	return phone;
 }

 public void setPhone(String phone) {
	this.phone = phone;
 }

 @Override
 public String toString() {
	return "Emp [name=" + name + ", id=" + id + ", phone=" + phone + "]";
 }

// @Override
// public int compareTo(Emp o) {
//	// TODO Auto-generated method stub
//	return this.id-o.id;
// }
   
    
   
   
   
}
