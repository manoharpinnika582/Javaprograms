import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner scanner=null;
		System.out.println("Enter number of elements to Strore:");
		int n=0;
		int arr[]=null;
		try {
			scanner=new Scanner(System.in);
			n=scanner.nextInt();
			arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=scanner.nextInt();
			}
		System.out.println("Your Array Elements are:");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
				findLargest(arr);
		}
		catch (Exception e) {
			System.out.println("Exception Handled.."+e);
		}

	}
	public static void findLargest(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("Largest Element: "+largest);
	}
	
}
