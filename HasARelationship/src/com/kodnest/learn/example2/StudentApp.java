package com.kodnest.learn.example2;

public class StudentApp {
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println(student.brain.color);
		System.out.println(student.brain.weight);
		System.out.println("=====================");
		Book book=new Book("Let Us C", "Yash", 1000);
		student.hasA(book);
		System.out.println("=====================");
		student=null;
		//if student is not their you will not access student brain
		System.out.println("Student is not their you will not Access brain");
//		System.out.println(student.brain.color);
//		System.out.println(student.brain.weight);
//		student.hasA(book);

		System.out.println("=====================");
		System.out.println("If student is not their but you can still access his book");
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
	}
}
