package com.java.exception;

public class ExceptionInCatchAndFinally {
	
	
	public static void main(String[] args) {
		int i =0;
		int b = 1;
		try{
			int c = 1/0;
		}catch(Exception ex){
			System.out.println("Exception from catch ");
		}finally{
			try{
				int c = 1/0;
			}catch(Exception ex){
				System.out.println("Exception from finally ");	
			}
		}
		
	}
	
	
	public void exceptionTest()throws ArithmeticException{
		
		
	}

}
