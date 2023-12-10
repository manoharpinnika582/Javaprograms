import java.util.Scanner;

public class PrintEvenNumArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr[]=new int[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Even Numbers in Given Array");
		printEvenNumbersInArray(arr);
	}
	
	public static void printEvenNumbersInArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
