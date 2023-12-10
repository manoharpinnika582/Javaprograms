import java.util.Scanner;

public class AdditionOfMatrix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of rows and cols for 2 matrixes");
		int rows=scanner.nextInt();
		int cols=scanner.nextInt();
		int arr1[][]=new int[rows][cols];
		int arr2[][]=new int[rows][cols];
		System.out.println("Enter elements for 1 Matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr1[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Your 1 first Matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr1[i][j]+" ");;
			}
			System.out.println();
		}
		System.out.println("Enter elements for 2 Matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr2[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Your 2 first Matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr2[i][j]+" ");;
			}
			System.out.println();
		}
		int arr3[][]=new int[rows][cols];
		printMatixSum(arr1, arr2,arr3);
		System.out.println("Your final Sum Matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr3[i][j]+" ");;
			}
			System.out.println();
		}
	}
	
	public static void printMatixSum(int arr1[][],int arr2[][],int arr3[][]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
	}
}
