package com.kodnest.projectsection;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Manohar");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter charecter Number");
		char ch=scanner.next().charAt(0);
		System.out.println("Enter A Number");
		byte s=scanner.nextByte();
		System.out.println("Enter A Number");
		short sh=scanner.nextShort();
		System.out.println("Enter A Number");
		int a=scanner.nextInt();
		System.out.println("Enter A long Number");
		long l=scanner.nextLong();
		System.out.println("Enter A float Number");
		float b=scanner.nextFloat();
		System.out.println("Enter A Number");
		double d=scanner.nextDouble();
		System.out.println("Enter true or false Number");
		boolean bl=scanner.nextBoolean();
		System.out.println(ch);
		System.out.println(s);
		System.out.println(sh);
		System.out.println(a);
		System.out.println(l=s+sh);
		System.out.println(a=(int)l);
		System.out.println(b);
		System.out.println(d);
		System.out.println(bl);
	}
}
