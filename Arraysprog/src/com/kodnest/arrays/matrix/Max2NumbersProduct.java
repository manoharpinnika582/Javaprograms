package com.kodnest.arrays.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Max2NumbersProduct {
		public static int findMaxProduct(int arr[]) {
			int maxProduct;
			Arrays.sort(arr);
//			int first=arr[arr.length-1];
//			int second=arr[arr.length-2];
//			maxProduct=first*second;
			
			//you can write like this also
			int n=arr.length;
			maxProduct=arr[n-1]*arr[n-2];
			return maxProduct;
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
		int res=findMaxProduct(arr);
		System.out.println("Max product of 2 numbers is: "+res);
	}
}
