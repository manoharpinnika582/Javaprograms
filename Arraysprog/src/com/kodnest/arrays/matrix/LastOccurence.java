package com.kodnest.arrays.matrix;

import java.util.Scanner;
	
public class LastOccurence {
	public static int findLastOccurance(int arr[],int target) {
		int lastIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				lastIndex=i;
			}
		}
		return lastIndex;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array length:");
		int arr[]=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Your Array elements:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter a target:");
		int target=scanner.nextInt();
		int lastOccurance=findLastOccurance(arr,target);
		System.out.println("Your last Occurance is: "+lastOccurance);
		scanner.close();
	}
}
