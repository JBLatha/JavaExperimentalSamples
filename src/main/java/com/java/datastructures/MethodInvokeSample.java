package com.java.datastructures;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodInvokeSample {

	public static void main(String[] args) throws Throwable {
		Sample sample = new Sample();
		setField(sample,"sampleTestMethod","hi hello");				
	}
	
	
	private static void setField(Object obj , String methodName , String value) throws Throwable{
		MethodHandle sayHelloHandle = null;
		try{
			//Method method = obj.getClass().getMethod(methodName, String.class);
			//method.invoke(obj, value);
			
			System.out.println(obj.getClass());
			sayHelloHandle =
					   MethodHandles.lookup().findVirtual(
						 obj.getClass(),
						 methodName,
					     MethodType.methodType(void.class,String.class));					
			
			sayHelloHandle.invoke(obj,value);		
			
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}


class Sample{
	
	public void sampleTestMethod(String value){
		System.out.println(value);
		//return value;
	}
	
	
	
}
