package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class FindMaxValueInArrayApp {

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
		FindMaxValueArray mArray=new FindMaxValueArray();
		int max=mArray.findmaxValue(arr);	
		System.out.println("Your Max Value Present In An Array Is "+max);
	}
	

}
