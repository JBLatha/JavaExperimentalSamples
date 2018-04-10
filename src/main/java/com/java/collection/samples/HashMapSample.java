package com.java.collection.samples;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		Employee employee = new Employee("test", 1, null, "tert");
		Employee employee1 = new Employee("test", 2, null, "tert");
		Person person = new Person();
		person.setId(1);

		Map<Object, Integer> map = new HashMap<>();
		
		map.put(employee, 1);
		map.put(employee1, 3);
		map.put(person, 2);
		
		
		Map<Integer, Integer> map1 = new HashMap<>();
		
		map1.put(1, 1);
		map1.put(2,1);
		map1.put(3, 2);
		map1.keySet().forEach(key -> {
			System.out.println("key Map1 :: " + key.hashCode());
		});
	}

}
