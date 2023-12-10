import java.util.Scanner;

public class NumberOfElements {

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
		int count = 0;
		for (int x : arr1) {
			System.out.print(x+" ");
			count++;
		}
		System.out.println();
		System.out.println(count+" Elements Present in Array");
	}

}
