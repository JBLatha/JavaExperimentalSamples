package com.java.string.samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringManipulations {

	public static void main(String[] args) {
	StringManipulations sm = new StringManipulations();
		
		//sm.show();
		sm.reverseString();
		
	}

	public void reverseString(){
		
		String r = new String("latha");
		
		String re[] = r.split("");
		
		/*for(int i= r.length()-1;i >= 0 ;i--){
			System.out.print(re[i]);	
		}
		
		
		for(int x = r.length()-1; x >= 0;x --){
			System.out.print(r.charAt(x));
		}*/
		
		String [] palindromelist = {"latha","tat","lal","deepu"};
		
		for(int y =0; y< palindromelist.length ;y++){
			String temp = reverseStringVal(palindromelist[y]);
			if(palindromelist[y].matches(temp)){
			System.out.println(palindromelist[y]);	
			}
		}
		
		
		
		
		
		
		
		/*Map map = new HashMap();
		for(int j=0;j< re.length;j++){
			
			if(map.containsValue(re[j])){
				map.put(j, re[j]);	
			}else{
				map.put(j, re[j]);
			}
			
		}
		
		
		for(int k=0;k< map.size();k++){
			System.out.println(map.get(k));
		}*/
		
		
		
	}
	
	String reverseStringVal(String a){
		String  reversedString = "";
		for(int x = a.length()-1; x >= 0;x --){
			reversedString += a.charAt(x);
		}
	return reversedString;
	}
	
}


