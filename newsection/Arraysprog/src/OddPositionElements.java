import java.util.Scanner;

public class OddPositionElements {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Array SIze");
	int arr[]=new int[scanner.nextInt()];
	//storing the elements into an array
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scanner.nextInt();
	}
	//printing the odd position elements present in an array
	for(int i=0;i<=arr.length-1;i=i+2) {
		System.out.print(arr[i]+" ");
	}
}
}
