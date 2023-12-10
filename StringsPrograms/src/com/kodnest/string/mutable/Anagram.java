package com.kodnest.string.mutable;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1=scanner.nextLine();
		System.out.println("Enter 2nd String");
		String str2=scanner.nextLine();
		str1.toLowerCase();
		str2.toLowerCase();
		char arr1[]=str1.toCharArray();
		char arr2[]=str1.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(str1.equals(str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}
}
