import java.util.Scanner;

public class UpdateElement {
	
		public static void updateELement(int arr[],int n,int value) {
			for(int i=0;i<arr.length;i++) {
				if(i==n) {
					arr[i]=value;
				}
			}
		}
		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array length:");
		int arr[]=new int[scanner.nextInt()];
		System.out.println("Enter array Elments:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Before Update:");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter a pos where you want to update:");
		int n=scanner.nextInt();
		System.out.println("Enter a Value to update:");
		int value=scanner.nextInt();
		updateELement(arr, n, value);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		scanner.close();
	}
}
