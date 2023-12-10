package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class BobbleSortdesc {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No.of elements you want:");
		int arr[]=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Original Elements:");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		bobbleSortDescending(arr);
		System.out.println();
		System.out.println("After Descending Elements:");
		for(int k:arr) {
			System.out.print(k+" ");
		}
		
	}
	
	public static void bobbleSortDescending(int arr[])
	{
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
	}
}
