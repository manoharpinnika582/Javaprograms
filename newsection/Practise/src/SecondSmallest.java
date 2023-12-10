import java.util.Scanner;

public class SecondSmallest {
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
		findSeclargest(arr);
		scanner.close();
	}
	
	public static void findSeclargest(int arr[]) {
		int smallest=arr[0];
		int secSmallest=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]!=smallest && arr[i]<secSmallest) {
				secSmallest=arr[i];
			}
		}
		System.out.println("Smallest: "+smallest);
		System.out.println("Smallest: "+secSmallest);
	}
}
