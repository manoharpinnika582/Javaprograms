package learn.manohar.kodnest.sortingseraching;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr1[]=new int[scanner.nextInt()];
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scanner.nextInt();
		}
		int arr2[]=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Array 1 Contents Are.....");
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Array 2 Contents Are.....");
		for (int i : arr2) {
			System.out.print(i+" ");
		}
	}

}
