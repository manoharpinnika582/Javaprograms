import java.util.Scanner;
public class CountNoOfElements {
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
		findSumOfElements(arr);
		scanner.close();
	}
	
	public static void findSumOfElements(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of Elements: "+sum);
	}
	
	
}
