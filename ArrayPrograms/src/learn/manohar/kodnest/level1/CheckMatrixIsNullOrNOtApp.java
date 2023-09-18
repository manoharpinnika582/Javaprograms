package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class CheckMatrixIsNullOrNOtApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 st and 2nd Array size");
		int arr[][]=new int [scanner.nextInt()][scanner.nextInt()];
		
		System.out.println("Enter "+arr.length+" Store in Array");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter Element "+i+" What You Want To Store in "+j);
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Your Matrix is");
		//I am Printing Using For Each 
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.println();
		}
		CheckMatrixIsNullOrNot c=new CheckMatrixIsNullOrNot();
			boolean res=c.isMatrix(arr);
			if(res==true) {
				System.out.println("Your Matrix Is Null");
			}
			else {
				System.out.println("Your Matrix is Not Null");
			}
			System.out.println("================================");
			System.out.println("NOTE : If you want to matrix Is Null Should Enter All Elements Zero(0)");
			
		}
	

}
