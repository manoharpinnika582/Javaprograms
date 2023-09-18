// Negitive numbers can't print----->


package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int arr[]=new int [scanner.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Array Contents Are.....");
		for(int i:arr) {
			if(i>=0) {
			System.out.print((i)+" ");
			}
		}
		System.out.println();
		scanner.close();
	}

}
