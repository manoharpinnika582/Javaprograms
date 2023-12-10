import java.util.Scanner;

public class Example {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Array length:");
	int arr[]=new int[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	System.out.println("Your Array Contents Are:");
	for (int x : arr) {
		System.out.print(x);
	}
	System.out.println();
	System.out.println("Enter a key to Search:");
	int target=scanner.nextInt();
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==target) {
				System.out.println(i+"-"+j);
			}
		}
	}
}
}
