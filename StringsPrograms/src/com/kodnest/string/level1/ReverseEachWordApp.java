package com.kodnest.string.level1;

import java.util.Scanner;

public class ReverseEachWordApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your String");
		String str=scan.nextLine();
		ReverseEachWord theEachWord=new ReverseEachWord();
		theEachWord.reverseWord(str);
	}

}
