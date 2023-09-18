package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class PrintEvenPositionsApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scanner.nextInt()];
		System.out.println("Enter "+arr.length+" Elments Stored in Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Your Array Elments Are.......");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		PrintEvenPosition position=new PrintEvenPosition();
		position.findEvenPositionNumber(arr);
		
	}

}
