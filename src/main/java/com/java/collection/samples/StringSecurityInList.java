package com.java.collection.samples;

import java.util.ArrayList;
import java.util.List;

public class StringSecurityInList {

	public static void main(String[] args) {
		
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("latha");
		list1.add("karthik");
		list1.add("rani");
		list1.add("bhaskar");
		list1.add("suji");
		list1.add("kalpana");
		list1.add("deepu");
		list1.add("pandu");
		
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("aaaaa");
		list2.add("bbbbbb");
		list2.add("cccccc");
		list2.add("dddddd");
		list2.add("suji");
		list2.add("eeeee");
		list2.add("deepu");
		list2.add("fffffff");
		
		List<String> list3  = new ArrayList<>();
		
		
		for(String name : list1){
		    if (list2.contains(name)){
		    	System.out.println(name);	
		    }
		}
		
		list1.forEach(name -> System.out.println(list2.contains(name)));
		
		StringStorageProcessInList();
	}
	
	
	
	public static void StringStorageProcessInList(){
		
		List<String> testList = new ArrayList<>();
		
		String exp = new String("latha");
		testList.add(exp);
		testList.add("latha");
		testList.add("devansh");
		testList.add("devansh");
		
		for (String s : testList){
			  System.out.println("index related :"+testList.indexOf(s));
		}
		
		
		
	}

	}


