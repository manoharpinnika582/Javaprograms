import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr[]=new int[scanner.nextInt()];
		//storing the elements into an array 
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		//printing the elements which present in an array
		System.out.println("Your Array Elements Are.....");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		//Revesed Elements present in array
		System.out.println("Your Reversed Array Elements Are.....");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
