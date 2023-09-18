package learn.manohar.kodnest.sortingseraching;

import java.util.Scanner;

public class LinearArraySearchApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr[]=new int[scanner.nextInt()];
		System.out.println("Enter "+arr.length+" elmenents Stored in Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enter a Target to Find it is present or Not");
		int key=scanner.nextInt();
		LinearArraySearch search=new LinearArraySearch();
		boolean index=search.isPresent(arr, key);
		if(index==true) {
			System.out.println("Target Is Found  ");
			return;
		}
		else {
			System.out.println("Target is not Found");
		}

	}

}
