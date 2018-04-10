package com.java.collection.samples;

import javax.servlet.jsp.el.ImplicitObjectELResolver;

interface A{
	void test();
}

class B implements A{
	public void test(){
		System.out.println("from B");
	}
}


class C implements A{
	public void test(){
		System.out.println("from C");
	}
	
	public void check(){
		System.out.println("check");
	}
}


public class InterfaceSample___ extends B {

	public static void main(String[] args) {
		A a = new InterfaceSample___();
		B b = new InterfaceSample___();
		A c = new C();
		
		
		a.test();
		b.test();
		c.test();
		
		((C)c).check();
	}
	
	
	
	
	
}
