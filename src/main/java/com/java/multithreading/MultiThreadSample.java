package com.java.multithreading;



class ThreadSample extends Thread{
	public void run(){
		System.out.println("Thread started-----");	
	}
	
	public void run(int i)
	{
			System.out.println("This is from int arg run()");
	}
}

public class MultiThreadSample {

	public static void main(String[] args) {
		
		Thread t1 = new ThreadSample();
		t1.start();	
	}
}
