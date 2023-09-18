package learn.manohar.kodnest.level3;

import java.util.Scanner;

public class ArrayNegitiveToReplace0App {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr1[]=new int[scanner.nextInt()];
		System.out.println("Enter "+arr1.length+" elements Stored in 1 st Array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scanner.nextInt();
		}
		
		ArrayNegitiveToReplace0 ar=new ArrayNegitiveToReplace0();
		ar.arrayReplace(arr1);	
		System.out.println("Your  Elements After Replacing------>");
		for ( int i : arr1) {
			System.out.println(i+" ");
		}
	}

	
}
