package learn.manohar.kodnest.level3;

import java.util.Scanner;

public class SumArray1AndArray2App {

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
		System.out.println("Your Arra-1 Elements Are------>");
		for ( int i : arr1) {
			System.out.println(i+" ");
		}
		System.out.print("Your Arra-2 Elements Are------>");
		for ( int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		SumArray1AndArray2 sumArray1AndArray2=new SumArray1AndArray2();
		int arr3[]=sumArray1AndArray2.sumOfTwoArray(arr1, arr2);
		System.out.println("Your Sum Of Two Corresponding Arrays Are....");
		for ( int i : arr3) {
			System.out.print(i+" ");
		}
	}

}
