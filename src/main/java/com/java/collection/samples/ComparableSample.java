/**
 * 
 */
package com.java.collection.samples;

import java.util.Arrays;

/**
 * @author M1032933
 *
 */
public class ComparableSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Address address = new Address("Bandla","Andhra",517001);
		Address address1 = new Address("CTR","Andhra",617001);
		Address address2 = new Address("ATP","Andhra",817001);
		Address address3 = new Address("BNG","Karnataka",917001);
		
		Employee [] employee = new Employee[3];
		employee[0] = new Employee("Zatha",3,address,"jblatha@gmail.com");
		employee[1] = new Employee("Suha",3,address1,"suha@gmail.com");
		employee[2] = new Employee("Yeepak",2,address2,"deepak@gmail.com");
		
		Arrays.sort(employee);
		
		
		System.out.println(Arrays.toString(employee));
		
		Arrays.sort(employee, new AgeComparator() );
        System.out.println("Employees list sorted by age:\n"+Arrays.toString(employee));
		

	}

}
