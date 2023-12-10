package com.kodnest.arrays.matrix;

import java.util.Scanner;

public class AnticlockWisePrint {
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
		System.out.println("Your AnticlockWise array:");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(j==0) {
			System.out.print(arr[i][j]+" ");
				}
			}
		}

		for(int i=0;i<rows;i++) {
			for(int j=1;j<cols;j++) {
				if(i== rows-1) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}

		
		
		for(int i=rows-2;i>0;i--) {
			for(int j=cols-1;j>0;j--) {
				if(j==cols-1){
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		
		
		for(int i=0;i<rows;i++) {
			for(int j=cols-1;j>0;j--) {
				if(i== 0) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}

		scanner.close();

	}

}

