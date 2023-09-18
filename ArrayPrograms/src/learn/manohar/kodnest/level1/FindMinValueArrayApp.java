package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class FindMinValueArrayApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scanner.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter Element to Stored in Array "+i+" Index And Length "+arr.length);
			arr[i]=scanner.nextInt();
		}
		System.out.println("Your Array Elements Are......");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		FindMinValueArray mArray=new FindMinValueArray();
		int min=mArray.findMinValue(arr);	
		System.out.println("Your Min Value Present In An Array Is "+min);
	}
	}


