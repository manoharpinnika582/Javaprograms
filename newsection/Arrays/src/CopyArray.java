import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Array Size");
		int arr1[]=new int[scanner.nextInt()];
		//storing the elements into an array
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scanner.nextInt();
		}
		//Printing the elements present in an array
		System.out.println("Your Array Elments Are");
		for (int x : arr1) {
			System.out.print(x+" ");
		}
		System.out.println();
		//creating second array
		int arr2[]=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("After Copying Your Array Elments Are");
		for (int y : arr2) {
			System.out.print(y+" ");
		}
	}

}
