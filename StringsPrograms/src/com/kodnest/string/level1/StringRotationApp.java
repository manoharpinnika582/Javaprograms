package com.kodnest.string.level1;

import java.util.Scanner;

public class StringRotationApp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a 2 Strings to find rotation String:");
	String str1=scanner.next();
	String str2=scanner.next();
	StringRotation stringRotation=new StringRotation();
	boolean isRotation=stringRotation.isRotation(str1, str2);
	if(isRotation) {
		System.err.println(str2+" is a Rotaion of "+str1);
	}
	else {
		System.out.println(str2+" is not a Rotation of "+str1);
	}
	scanner.close();
}
}
