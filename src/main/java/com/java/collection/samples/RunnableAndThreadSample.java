package com.java.collection.samples;

public class RunnableAndThreadSample extends Thread implements Runnable {

	public static void main(String[] args) {
		try{
			Thread t = new Thread(new RunnableAndThreadSample());
			t.start();
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
