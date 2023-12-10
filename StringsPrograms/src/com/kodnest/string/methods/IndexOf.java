package com.kodnest.string.methods;

import java.util.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scanner.nextLine();
		System.out.println("Enter A Charecter");
		System.out.println(str.indexOf(scanner.next().charAt(0)));
	}

}
