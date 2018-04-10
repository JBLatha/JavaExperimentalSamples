package com.java.sapient.samples;

public class FibbonaciSeries {

	public static void main(String[] args) {
		
		int a =0;
		int b= 1;
		int range = 20;
		if (range == 0){
			System.out.println(0);
		}else{
			System.out.println(0);
			if(range == 1)
			System.out.println(1);
			
			while (range > 1){
				int c = a + b;
				//System.out.println(c);
				a = b;
				b = c;
				range--;
			}
		}
		//getPrimeNumbers();
		errorCheckForFinal();
		
	}
	
	
	/**
	 * getPrime Numbers
	 */
	public static void getPrimeNumbers(){
		
		int  givenRange = 30;
		int flag = 0;
		int temp = 0;
		
		for(int i=2;i< givenRange;i++){
			
			if(givenRange % i == 0){
				flag = 1;
				temp = i;
				break;
			}	
		}
		
		if(flag ==1){
			System.out.println(temp);
		}
	}
	
	
	public static void errorCheckForFinal(){
		 final Integer[] array ={1,2};
         System.out.println(array[0]);
         System.out.println(array[1]);
         array[0]=10;
         System.out.println(array[0]);
         
         // reference can not initialize for final values can be changes
         final int arr1[] = {1, 2, 3, 4, 5};
         arr1[0]= 10;
         int arr2[] = {10, 20, 30, 40, 50};
         arr2 = arr1;      
         //arr1 = arr2;  // uncomment this line to test the result
         for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);
         
	}
	
	
	
	
}


