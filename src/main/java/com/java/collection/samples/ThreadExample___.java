package com.java.collection.samples;

import java.util.ArrayList;
import java.util.List;

class Example extends Thread{
	
	Example() {
		System.out.println("Example");
	}
	
	public void run(String s){
		System.out.println("Baz");
	}

	
	public void run(){
		System.out.println("Bar");
	}	
}






public class ThreadExample___{
	
	
	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList();
		l1.add("janu");
		l1.add("d1");
		l1.add("d2");
		l1.add("d3");
		l1.add("d4");
		l1.add("d5");
		
		
		
		List<String> l2 = new ArrayList();
		l2.add("janu");
		l2.add("d1");
		l2.add("j3");
		l2.add("j4");
		l2.add("j5");
		
		
		l1.retainAll(l2);
		
		for (String e: l1){
			System.out.println(e);
		}
		
		
		Example ex = new Example(){
			public void run(){
				System.out.println("foo");
			}
		};
		
		ex.start();

	}

}
