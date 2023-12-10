import java.util.Scanner;

public class RotatingArrayLeft {
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
	System.out.println("Enter a Number How to Times to Rotate");
	int n=scanner.nextInt();
	for(int i=0;i<n;i++) {
		int first=arr1[0];
		int j;
		for( j=0;j<=arr1.length-2;j++) {
			arr1[j]=arr1[j+1];
		}
		arr1[j]=first;
	}
	System.out.println("After Rotating The Elments");
	for (int x : arr1) {
		System.out.print(x+" ");
	}
}
}
