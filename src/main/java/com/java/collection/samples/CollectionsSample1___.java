package com.java.collection.samples;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSample1___ implements Comparable{
	Integer id;
	
	CollectionsSample1___(int id){
		this.id = id;
	}
	
	public String toString(){
		return this.id.toString();
	}
	

	public static void main(String[] args) {
		Set s = new TreeSet();
		
		CollectionsSample1___ cs1 = new CollectionsSample1___(1);
		
		CollectionsSample1___ cs3 = new CollectionsSample1___(2);
		
		CollectionsSample1___ cs4 = new CollectionsSample1___(7);
		s.add(cs1);
		s.add(cs3);
		s.add(cs4);
		//System.out.println(s.size());
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

	
	public int hashCode(){
		int result =1;
		result = 31 + ((id == null) ? 0 : id.hashCode());
		
		System.out.println("result : " +result);
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		return this.id.equals(((CollectionsSample1___)obj).id);
	}

	@Override
	public int compareTo(Object o) {
		return 1;
	}
}

