package com.java.collection.samples;

class Hello{
	
	
	final static int x= 30;
	static{
		System.out.println("Static block");
	}
}


public class InnerClassSample____ {

	public static void main(String[] args) {
				System.out.println(Hello.x);
	}

}
