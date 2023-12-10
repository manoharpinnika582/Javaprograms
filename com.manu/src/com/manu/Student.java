package com.manu;

class StudentApp
{
	int id;
	String name;
	int age;
	
	void eat() {
		System.out.println("Student is eating");
	}
	void sleep() {
		System.out.println("Student is sleeping");
	}
	void study() {
		System.out.println("Student is studying");
	}
}

public class Student {
	public static void main(String[] args) {
		StudentApp s1=new StudentApp();
		s1.id=582;
		s1.name="Manu"; 
		s1.age=20;
		s1.eat();
		s1.sleep();
	    s1.study();	
	    System.out.println(s1.id);
	    System.out.println(s1.name);
	    System.out.println(s1.age);
	}

}
