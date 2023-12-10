import java.util.Scanner;

public class MaxSubArray1 {
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
		findMaxSubArraySum(arr);
		scanner.close();
	}
	public static void findMaxSubArraySum(int arr[]) {
		int sum=arr[0];
		int maxSum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(sum>=0) {
				sum+=arr[i];
			}
			else {
				sum=arr[i];
			}
			if(sum>maxSum) {
				maxSum=sum;
			}
		}
		System.out.println("Max Sum SubArray: "+maxSum);
	}
}
