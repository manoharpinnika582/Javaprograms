package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class FindDuplicateInArrayApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scanner.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter "+i+" Element Stored in Array Length "+arr.length);
			arr[i]=scanner.nextInt();
		}
		System.out.println("Your Array Elements Are......");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		FindDuplicateInArray freArray=new FindDuplicateInArray();
		int res=freArray.findFrequency(arr);
		System.out.println("Number of duplicate Values in Array Is "+res);
		
		
	}

}
