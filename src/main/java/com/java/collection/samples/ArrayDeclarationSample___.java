package com.java.collection.samples;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class ArrayDeclarationSample___ {
	
	public static void main(String[] args) {
		int x=2,b[]=new int[2];
		//System.out.println(b[x]); // Run time Exception
		
		stringParser();
	}
	
	public static void stringParser(){
		
		String str1 = "Latha";
		String str2 = "Deepak";
		String str3 = str1 + str2;
		String str4 = "Karthik";
		System.out.println(str3 == str4);//  false 
	}

}
