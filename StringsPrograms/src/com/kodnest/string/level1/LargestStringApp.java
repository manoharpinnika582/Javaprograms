package com.kodnest.string.level1;

import java.util.Scanner;

public class LargestStringApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String lines To find largest String:");
		String inputString=scanner.nextLine();
		LargestString lString=new LargestString();
		String largest=lString.findLargestString(inputString);
		if(!largest.isEmpty())
			System.out.println("Your largest string is:"+largest);
		else
			System.out.println("No words Found in the input line....");
	}
}
