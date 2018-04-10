package com.java.pattern.samples;

public class SpringLooping {

	public static void main(String[] args) {
		
		String name = new String("latha");
		
		StringBuilder temp = new StringBuilder(name);
		//temp.reverse();
		
		StringBuilder count = new StringBuilder();
		
		for(int i=0;i<temp.length();i++){
			
			
			count.append(temp.charAt(i));
			
			for(int j=i;j< temp.length();j++){
				
				if(j < temp.length()-1 ){
					System.out.print("-" );
				}else{
					System.out.print("" + count);	
				}
				//System.out.print("-" );
			}
			System.out.print("\n" );
			
		}
		numberPattern();
		numberLeftSidePattern();
	}
	
	
	public static void numberPattern(){
		
		
		for (int i=1 ;i<= 7 ;i++){
			
			for(int j = 1; j <= i ;j++){
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		for (int i=7 ;i >= 1 ;i--){
			
			for(int j = 1; j <= i ;j++){
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	
	public static void numberLeftSidePattern(){
		
		
		for (int i=1 ;i<= 7 ;i++){
			for(int j = i; j <= 7 ;j++){
				if(j < 7){
					System.out.print(" ");
				}else{
					//System.out.print(i);
					
					for(int k=0;k <=i ;k++){
					System.out.print(i);	
					}
				}
			}
			System.out.println();
		}
		
		for (int i=7 ;i >= 1 ;i--){
			for(int j = i; j <= 7 ;j++){
				if(j < 7){
					System.out.print(" ");
				}else{
					//System.out.print(i);
					for(int k=0;k <=i ;k++){
						System.out.print(i);	
						}
				}
			}
			System.out.println();
		}
		
	}
	

}
