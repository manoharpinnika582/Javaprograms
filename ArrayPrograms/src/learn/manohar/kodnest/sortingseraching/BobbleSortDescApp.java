package learn.manohar.kodnest.sortingseraching;

import java.util.Scanner;

public class BobbleSortDescApp {

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
		BobbleSortDesc bobbleSortDesc=new BobbleSortDesc();
		bobbleSortDesc.findDescSort(arr);
		System.out.println("Array Elements After Sorted");
		//Another Approch
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}

}
