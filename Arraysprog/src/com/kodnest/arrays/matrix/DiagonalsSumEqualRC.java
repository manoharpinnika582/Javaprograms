package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class DiagonalsSumEqualRC {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array length:");
		int rows=scanner.nextInt();
		int arr[][]=new int[rows][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Original Elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		int dia1=0;
		int dia2=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(i==j) {
					dia1=dia1+arr[i][j];
				}
				if(i+j==rows-1) {
					dia2=dia2+arr[i][j];
				}
			}
		}
		
		
		System.out.println(dia1);
		System.out.println(dia2);
		System.out.println("Diagonal Sum is: "+(dia1+dia2));

	}
}
