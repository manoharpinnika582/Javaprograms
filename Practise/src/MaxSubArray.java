import java.util.Scanner;

public class MaxSubArray {
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
		findMaxSubArray(arr);
		scanner.close();
	}
	public static void findMaxSubArray(int arr[]) {
		int maxSubArray=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				maxSubArray=Math.max(sum, maxSubArray);
			}
		}
		System.out.println("Max Sub Array: "+maxSubArray);
	}
}
