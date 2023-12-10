package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class BorderElements {
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
	System.out.println("Original Elements:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
		}
	}
	System.out.println();
	System.out.println("Border Elemets:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			if(i==0 || i==rows-1 || j==0 || j==cols-1) {
				System.out.print(arr[i][j]+" ");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
