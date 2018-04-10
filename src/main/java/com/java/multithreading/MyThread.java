package com.java.multithreading;

public class MyThread {

	public static void main(String[] args) {
		
		
		Thread myThread = new Thread(){
			
			public void run(){
				System.out.println("myThread class");
			}
		};
		
		Thread myThread1 = new Thread(){
			
			public void run(){
				System.out.println("myThread1 class");
			}
		};
		
		
		myThread1.start();
		//myThread1.sleep(arg0);
		myThread1.yield();
		
		
		System.out.println("starts"+Thread.currentThread().getName());
		try {
			
			myThread1.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ends" +Thread.currentThread().getName());
		
		myThread.start();
		
	}
	
}
