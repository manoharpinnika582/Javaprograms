package com.kodnest.singlelevel;

public class ParentChildApp {

	public static void main(String[] args) {
		Child theChild=new Child();
		System.out.println(theChild.eyeColor);
		theChild.hobby();
	}

}
