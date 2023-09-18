package learn.manohar.kodnest.sortingseraching;

import java.util.Scanner;

public class BobbleSortApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int [scanner.nextInt()];
		System.out.println("Enter "+arr.length+" Elments To stored in Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Array Elements Bofore Sorted");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		BobbleSort bobbleSort=new BobbleSort();
		bobbleSort.findSort(arr);
		System.out.println("Array Elments After Sorted");
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}

}
