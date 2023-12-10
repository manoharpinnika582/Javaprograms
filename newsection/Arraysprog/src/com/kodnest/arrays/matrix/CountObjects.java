package com.kodnest.arrays.matrix;

public class CountObjects {
	static int countObjects=0;
	
	public CountObjects(){
		countObjects++;
	}
	
	
	
	public static void main(String[] args) {
		CountObjects c1=new CountObjects();
		CountObjects c2=new CountObjects();
		CountObjects c3=new CountObjects();
		CountObjects c4=new CountObjects();
		
		System.out.println(CountObjects.countObjects);

	}
}
