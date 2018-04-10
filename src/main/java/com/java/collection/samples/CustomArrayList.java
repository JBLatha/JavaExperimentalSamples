package com.java.collection.samples;

import java.util.Arrays;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class CustomArrayList {

	int size = 5;
	int check = 0;
    String[] initialSize = new String[size];
	
	public static void main(String[] args) {
		
		CustomArrayList cal = new CustomArrayList();
		cal.addElements("latha");
		cal.addElements("deepak");
		cal.addElements("karthik");
		cal.addElements("pandu");
		cal.addElements("suji");
		cal.addElements("ffff");
		cal.getElement();

	}
	
	
	public void addElements(String str){
		
		for(int x = 0 ; x <= initialSize.length-1 ;x++){
			if(initialSize[x] == null){
				initialSize[x] = str;
				check++;
				break;
			}else{
				System.out.println(x);
			}
			 
		}
		
		if(size == check){
			
			int newSize = ((size*3)/2+1);
			System.out.println(newSize);
			String[] temp = new String[newSize];
			//System.arraycopy( initialSize,size,temp ,size+1,0);
			Arrays.copyOf(initialSize, newSize);
		    
		}
		
	}
	
	public void getElement(){

		for(int x = 0 ; x <= initialSize.length-1 ;x++){
			System.out.println(initialSize[x]);
		}
	}

}
