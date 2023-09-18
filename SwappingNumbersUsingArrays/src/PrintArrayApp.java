import java.util.Scanner;

public class PrintArrayApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int arr[]=new int [scanner.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		
			
		PrintArray pa=new PrintArray();
		
		System.out.println("Your Reversed Array is ");
		pa.printArray(arr);
		}
	}


