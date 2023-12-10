import java.util.Scanner;

public class SecondLargest {
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
		findSecSmallest(arr);
		scanner.close();
	}

	public static void findSecSmallest(int[] arr) {
		int largest=arr[0];
		int secLargest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>secLargest) {
				secLargest=arr[i];
			}
		}
		System.out.println("Largest: "+largest);
		System.out.println("Second Largest: "+secLargest);

	}
}
