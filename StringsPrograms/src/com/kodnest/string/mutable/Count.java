package com.kodnest.string.mutable;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=scanner.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			count++;
		}
		System.out.println(count);
	}

}
