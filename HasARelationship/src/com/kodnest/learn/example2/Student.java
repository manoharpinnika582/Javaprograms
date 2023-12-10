package com.kodnest.learn.example2;

public class Student {
	Brain brain=new Brain(900, "White");
	
	Book ref;
	public void hasA(Book ref) {
		this.ref=ref;
		System.out.println(ref.name);
		System.out.println(ref.author);
		System.out.println(ref.price);
	}
}
