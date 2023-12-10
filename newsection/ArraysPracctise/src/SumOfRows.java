import java.util.Scanner;

public class SumOfRows {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number of Rows and cols");
		int arr[][]=new int[scanner.nextInt()][scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		printSumOfRows(arr);
	}
	
	public static void printSumOfRows(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			int rowSum = 0;
			for(int j=0;j<arr[i].length;j++) {
				rowSum+=arr[i][j];
			}
			System.out.println("Row Sum "+(i+1)+": "+rowSum);
		}
		
		
	}
}
