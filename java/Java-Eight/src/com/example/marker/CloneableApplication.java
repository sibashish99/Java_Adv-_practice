package com.example.marker;

import java.util.Scanner;  
public class CloneableApplication implements Cloneable   
{  
  int pid;  
  String pname;  
  double pcost;     
  public CloneableApplication (int pid, String pname, double pcost){  
   this.pid = pid;  
   this.pname = pname;  
   this.pcost = pcost;  
  }    
  public void showDetail(){  
   System.out.println("Product ID: "+pid);  
   System.out.println("Product Name: "+pname);  
   System.out.println("Product Cost: "+pcost);  
  }  
  public static void main (String args[]) throws CloneNotSupportedException{  
   Scanner sc = new Scanner(System.in);  
   System.out.print("Enter product ID: ");  
   int pid = sc.nextInt();  
   System.out.print("Enter product name: ");  
   String pname = sc.next();  
   System.out.print("Enter product Cost: ");  
   double pcost = sc.nextDouble();  
   System.out.println("-------Product Detail--------");  
   CloneableApplication p1 = new CloneableApplication(pid, pname, pcost);   
   CloneableApplication p2 = (CloneableApplication) p1.clone();    
   p2.showDetail();  
  }  
} 