package com.kodnest.string.methods;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scanner.nextLine();
		System.out.println("Enter a Another String");
		System.out.println(str.concat(scanner.nextLine()));
	}

}
