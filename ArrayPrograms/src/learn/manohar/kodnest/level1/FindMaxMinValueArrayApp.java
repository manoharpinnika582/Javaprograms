package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class FindMaxMinValueArrayApp {

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
		FindMaxMinValueArray maxMinArray=new FindMaxMinValueArray();
		int max=maxMinArray.findMaxValue(arr);
		System.out.println("Your Max Value Present Array Is "+max);
		int min=maxMinArray.findMinValue(arr);
		System.out.println("Your Min Value Present Array Is "+min);
		
	}

}
