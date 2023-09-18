package learn.manohar.kodnest.level3;

import java.util.Scanner;

public class MergeArraysApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr1[]=new int[scanner.nextInt()];
		System.out.println("Enter "+arr1.length+" elements Stored in 1 st Array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scanner.nextInt();
		}
		int arr2[]=new int[arr1.length];
		System.out.println("Enter "+arr2.length+" elements Stored in 2 nd Array");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scanner.nextInt();
		}
		MergeArray mergeArray=new MergeArray();
		int arr3[]=mergeArray.arrayMerge(arr1, arr2);
		System.out.println("Your Merged Array Elements Are....");
		for (int i : arr3) {
			System.out.print(i+" ");
		}

		
			}

}
