package com.kodnest.arrays.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInGroup {
	public static int [] reverseGroup(int arr[],int group) {
		int n=arr.length;
		for(int i=0;i<n;i+=group) {
			int left=i;
			int right=Math.min(i+group-1, n-1);
			while(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		return arr;
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
		System.out.println("Enter a number ");
		int group=scanner.nextInt();
		int reversedArray[]=reverseGroup(arr, group);
		System.out.println("Your reversed group array is:");
		System.out.println(Arrays.toString(reversedArray));
		for(int x:arr) {
			System.out.print(x+" ");
		}
		scanner.close();
		
}
	}
