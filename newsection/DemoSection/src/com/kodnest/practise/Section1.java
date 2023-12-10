package com.kodnest.practise;

import java.util.Scanner;

public class Section1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Byte and Short Integer Value");
		byte b=scanner.nextByte();
		short s=scanner.nextShort();
		System.out.println("The Addion of "+b+" and "+s+" is "+(b+s));
		System.out.println("=============================================");
		System.out.println("Enter long and Integer Value");
		long l=scanner.nextLong();
		int i=scanner.nextInt();
		System.out.println("The Substraction of "+l+" and "+i+" is "+(l-i));
		System.out.println("=============================================");
		System.out.println("Enter Float and Byte Integer Value");
		float f=scanner.nextFloat();
		byte bt=scanner.nextByte();
		System.out.println("The Remainder of "+f+" and "+bt+" is "+(f%bt));
		System.out.println("=============================================");
		System.out.println("Enter Double and Integer Value");
		double d=scanner.nextDouble();
		int i1=scanner.nextInt();
		System.out.println("The Division of "+d+" and "+i1+" is "+(d/i1));
		scanner.close();
	}

}
