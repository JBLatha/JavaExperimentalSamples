package com.java.collection.samples;

class Parent{
	
	static void check(){
		System.out.println("paraent");
	}
	
	
}

public class StaticBlockClassSample____  extends Parent{
	
	static void test(){
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		
		Parent p = new StaticBlockClassSample____();
		
		//p.test(); //  compilation error
		looingSample();
	}
	
	public static void looingSample(){
		
		for(int i=0;i<3;i++){
			
			switch(i){
			case 0: break;
			case 1: System.out.println("1");
			case 2: System.out.println("2");
			case 3: System.out.println("3");	
		}
		}
		System.out.println("done");
	}

}
