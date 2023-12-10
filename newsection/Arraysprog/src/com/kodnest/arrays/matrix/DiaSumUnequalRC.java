package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class DiaSumUnequalRC {
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
	int dia1=0;
	int dia2=0;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			if(i==j) {
				dia1=dia1+arr[i][j];
			}
			if(i+j==cols-1) {
				dia2=dia2+arr[i][j];
			}
		}
	}
	
	
	System.out.println(dia1);
	System.out.println(dia2);
	System.out.println("Diagonal Sum is: "+(dia1+dia2));

}
}

