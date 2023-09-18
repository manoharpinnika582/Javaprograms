package learn.manohar.kodnest.level3;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr1[]=new int[scanner.nextInt()];
		System.out.println("Enter "+arr1.length+" elmenents Stored in Array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scanner.nextInt();
		}
		FindSum findSum=new FindSum();
	    int res=findSum.findSum(arr1);	
	    System.out.println("Sum of Array Elements is "+res);
	}
	
}
