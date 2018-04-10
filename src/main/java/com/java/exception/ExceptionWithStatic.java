package com.java.exception;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExceptionWithStatic {

	public static void main(String[] args) {
		//System.out.println(show());	
		//System.out.println(show1());
		listSample();
	}
	
	static int show(){
        try{
            throw new NullPointerException();
        }
        finally{
            return 2;
        }
	}
	
	static int show1(){
        try{
            return 1;
        }
        finally{
            return 7;
        }
        
     
   }
	
	 static void listSample(){
   
		 List<Integer> lisst= new ArrayList();
   	     lisst.add(1);
   	     lisst.add(3);
   	     lisst.add(5);
   	     lisst.add(7);
   	     
   	     for(Integer a : lisst){
   	    	 System.out.println("Before "+a);
   	     }
   	     
   	     lisst.remove(1);
   	     lisst.remove(3);

   	     for(Integer a : lisst){
   	    	 System.out.println("After "+a);
   	     }
   	  
     }

}

