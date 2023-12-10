import java.util.Scanner;

public class PrimeNumberSumArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Array length");
	int arr[]=new int[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	
	boolean key=false;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=1)
			key=false;
		else {
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					key=false;
					break;
				}
			}
		}
		key=true;
	}
	int sum=0;
	if(key==true) {
	for(int j=0;j<arr.length;j++) {
		sum+=arr[j];
	}
	System.out.println(sum);
	}
}
}

