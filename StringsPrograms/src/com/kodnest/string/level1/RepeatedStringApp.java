package com.kodnest.string.level1;

import java.util.Scanner;

public class RepeatedStringApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A string Line:");
		String inputString=scanner.nextLine();
		RepeatedString repeatedString=new RepeatedString();
		repeatedString.findRepeatedString(inputString);
		scanner.close();
	}
}
