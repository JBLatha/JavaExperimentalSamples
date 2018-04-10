package com.java.collection.samples;

public class StudentSample___ {

	public static void main(String[] args) {
		Student stu = new Student(10);
		Student stu1 = new Student(35);
		change(stu);
		System.out.println(stu.sid);
		}
	
	
	static void change(Student stud){
		stud.sid = stud.sid+10;
	}

	
}

class Student{
	static int sid;
	Student (int sid){
		this.sid = sid;
	}
	
}
