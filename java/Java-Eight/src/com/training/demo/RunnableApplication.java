package com.training.demo;

class RunnableImp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
         System.out.println("Run method called.");
	}
}

public class RunnableApplication {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Runnable is functional interface
		 * Java runnable is an interface used to execute code on a concurrent thread. 
		 * It is an interface which is implemented by any class if we want that the instances of that class should be executed by a thread.
		 * The runnable interface has an undefined method run() with void as return type, 
		 */
		RunnableImp ex= new RunnableImp();
		Thread t1=new Thread(ex);
		t1.start();
		
		
		Thread t2= new Thread(() -> System.out.println("Ends..."));
		t2.start();
		
      
	}

}
