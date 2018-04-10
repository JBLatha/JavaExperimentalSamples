package com.java.pattern.samples;

public class NumberLoopingPattern {

	public static void main(String[] args) {
		
		String str = new String("latha");
		
		
		for(int i =1;i<=5 ;i++){
			System.out.print(i);
			for(int j=1;j<5;j++){
				if(j <= i){
					System.out.print(i);	
				}else{
				   System.out.print("*");
				}
				
			}
			
			System.out.print("\n");
		}
		

	}

}
