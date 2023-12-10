import java.util.Scanner;

public class SumOfPrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first Array Size");
		int size=scanner.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scanner.nextInt();
		}
		System.out.println("Enter second Array Size");
		int arr2[]=new int[size];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scanner.nextInt();
		}
		System.out.println("Prime Numbers in First Array");
		printSumOfPrime(arr1,arr2);
	}
	public static void printSumOfPrime(int arr1[],int arr2[]) {
		int arraySum1=0;
		int arraySum2=0;
		for(int i=0;i<arr1.length;i++) {
			if(isPrime(arr1[i])) {
				System.out.println(arr1[i]);
				arraySum1+=arr1[i];
			}
		}

		for(int i=0;i<arr2.length;i++) {
			if(isPrime(arr2[i])) {
				System.out.println(arr2[i]);
				arraySum2+=arr2[i];
			}
		}
		System.out.println("First Array Prime Number Sum: "+arraySum1);
		System.out.println("Second Array Prime Number Sum: "+arraySum2);
		System.out.println("Difference : "+(arraySum1-arraySum2));

	}
	public static boolean isPrime(int num) {

		if(num<=1) 
			return false;
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0)
					return false;
			}
		}
		return true;
	}
}
