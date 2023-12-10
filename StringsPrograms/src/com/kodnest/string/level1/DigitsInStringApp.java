package com.kodnest.string.level1;

import java.util.Scanner;

public class DigitsInStringApp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter A string With Digits:");
	String inputString=scanner.nextLine();	
	DigitsInString.findDigit(inputString);
	scanner.close();
}
}
