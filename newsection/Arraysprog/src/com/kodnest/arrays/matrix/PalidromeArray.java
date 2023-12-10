package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class PalidromeArray {
	public static boolean isPalindrome(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	//another method
	public static boolean checkPalindrome(int arr[]) {
		int first=0;
		int last=arr.length-1;
		while(first<last) {
			if(arr[first]!=arr[last]) {
				return false;
			}
			first++;
			last--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Array length:");
		int arr[]=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("your array elements are:");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Using 1nd method:");
		if(isPalindrome(arr)) 
			System.out.println("Your array is palindrome.");
		
		else 
			System.out.println("Your array is not palindrome.");
			
		System.out.println("Using 2nd method:");
		if(checkPalindrome(arr)) 
			System.out.println("Your array is palindrome.");
		
		else 
			System.out.println("Your array is not palindrome.");
		scanner.close();
	}
}
