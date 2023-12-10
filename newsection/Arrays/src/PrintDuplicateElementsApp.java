import java.util.Scanner;

public class PrintDuplicateElementsApp {

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
		System.out.println("Your Duplicate Elments Are ");
		//login 
		for(int i=0;i<=arr1.length-1;i++) 
		{
			for(int j=i+1;j<=arr1.length-1;j++) 
			{
				if(arr1[i]==arr1[j]) 
				{
					System.out.print(arr1[j]+" ");
				}
			}
		}
		

		
	}

}
