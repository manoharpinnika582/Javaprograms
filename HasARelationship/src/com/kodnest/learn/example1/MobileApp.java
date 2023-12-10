package com.kodnest.learn.example1;

public class MobileApp {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		System.out.println(mobile.os.type);
		System.out.println(mobile.os.name);
		System.out.println("====================");
		Charger charger=new Charger("White", "C-type", "MI");
		mobile.hasA(charger);
		System.out.println("====================");
		//if mobile lost Quick access os it will give error
		mobile=null;
		System.out.println("Mobile Lost");
		System.out.println("You cannot access the OS.!!");
//		System.out.println(mobile.os.name);
//		System.out.println(mobile.os.type);
		System.out.println("====================");
		System.out.println("If mobile lost also still we can use charger..!!");
		System.out.println(charger.getBrand());
		System.out.println(charger.getColor());
		System.out.println(charger.getType());
		
	}
}
