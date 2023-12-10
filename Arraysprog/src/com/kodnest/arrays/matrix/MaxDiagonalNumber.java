package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class MaxDiagonalNumber {
	public static int findMaxDiagonalNumber(int arr[][]){
		int maxDiagonal=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i][i]>maxDiagonal) {
				maxDiagonal=arr[i][i];
			}
		}
		return maxDiagonal;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array length:");
		int n=scanner.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter a class "+(i+1)+" in the student "+(j+1));
				arr[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Your array elements are:");
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int res=findMaxDiagonalNumber(arr);
		System.out.println("Your max daigonal is : "+res);
		scanner.close();
	}
}
