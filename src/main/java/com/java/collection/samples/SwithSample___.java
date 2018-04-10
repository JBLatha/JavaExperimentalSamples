package com.java.collection.samples;

public class SwithSample___ {
	
	public static void main(String[] args) {
		
		
		int x=2;
		//final long j =2;
		final char j ='2';
		switch(x){
		case 1:
			System.out.println("1");
			break;
		case 10:
			System.out.println("10");
			break;
		case  j: // long wont take as case
			System.out.println("1");
			break;
		
		case 5:
			System.out.println("5");
			break;
		default :
			System.out.println("Default");
			break;
		}
	}

}
