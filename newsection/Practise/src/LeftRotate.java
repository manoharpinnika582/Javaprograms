import java.util.Scanner;

public class LeftRotate {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array siize");
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter  values "+i);
			arr[i]=scanner.nextInt();
		}
		System.out.println("Your Array Elemnts...");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter a number to Ratate");
		int no=scanner.nextInt();
		findLeftRotateArray(arr,no);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		scanner.close();
	}
	public static void findLeftRotateArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int first=arr[0];
			int j=0;
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
	}
}
