package com.java8.samples;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {
	
	
	public static void main(String[] args) {
		
	Filter filter = new Filter();
	List<String> names = filter.getListObject();	
	
	for(String name : names){
		System.out.println(name);
	}
		
		
	//names.stream().forEach(name -> System.out.println(name));	
	
	names.forEach(name -> System.out.println(name));
	
	names.stream().distinct();
		
	}
	
	
	public List getListObject(){
		
		List<String> list = new ArrayList<String>() ;
		list.add("latha");
		list.add("deepak");
		list.add("devansh");
		list.add("latha");
			
		return 	list;
		
	}
	
	

}
