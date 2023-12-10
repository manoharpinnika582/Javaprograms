import java.util.Scanner;

public class ReplaceValueMultipleOfTwo {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Array SIze");
	int arr[]=new int[scanner.nextInt()];
	//storing the elements into an array
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scanner.nextInt();
	}
	//printing the elements present in an array
	System.out.println("Your Array Elements");
	for (int x : arr) {
		System.out.print(x+" ");
	}
	//printing the multiples of two elements present in an array replace by -1
	
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]%2==0) {
			arr[i]=-1;
		}
	}
	System.out.println("After Replace Elements");
	for (int x : arr) {
		System.out.print(x+" ");
	}
}
}
