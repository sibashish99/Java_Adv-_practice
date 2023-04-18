package com.example.marker;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableApplication {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/**
		 * An interface that does not contain methods, fields, and constants is known as marker interface.
		 * It delivers the run-time type information about an object. It is the reason that the JVM and compiler have additional information about an object.   
		 *Its uses, built-in (Serializable, Cloneable, and Remote Interfaces) and custom marker interface with examples
		 
		 *The declaration of marker interface is the same as interface in Java but the interface must be empty. For example:
         public interface Serializable{  
          
         }  
		 * 
		 * */
		
		/**
		 * Serializable
		 * It is a marker interface in Java that is defined in the java.io package. 
		 * If we want to make the class serializable, we must implement the Serializable interface.
		 * Serialization (converting an object into byte stream) is a mechanism in which object state is 
		   read from the memory and written into a file or database. 
		 * Deserialization (converting byte stream into an object) is the opposite of 
		   serialization means that object state reading from a file or database and written 
		   back into memory is called deserialization of object.
		 * Serializable - object => stream
		 * Deserializable - stream => object
		 * 
		 * */
		try {    
		 Employee emp =new Employee(1187345,"Andrew");     
		 FileOutputStream fout=new FileOutputStream("employee data.txt");    
		 ObjectOutputStream out=new ObjectOutputStream(fout);    
		 out.writeObject(emp);    
		 out.flush();        
		 out.close();    
		 System.out.println("Data has been read from the file.");    
		}  
		catch(Exception e){  
		 e.printStackTrace();  
		}    

	}

}
