package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class RowSum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no.of row:");
		int rows=scanner.nextInt();
		System.out.println("Enter a no.of columns:");
		int cols=scanner.nextInt();
		
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Row Sums:");
		printRowSum(arr);
	}
	
	public static void printRowSum(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			int rowSum=0;
			for(int j=0;j<arr[i].length;j++) {
				rowSum=rowSum+arr[i][j];
			}
			System.out.println("Rows Sums "+(i+1)+":"+rowSum);
		}
	}
	
	
	
	
	
}
