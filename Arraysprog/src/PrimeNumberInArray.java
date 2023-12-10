import java.util.Scanner;

public class PrimeNumberInArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr[]=new int[scanner.nextInt()];
		//storing the elements into an array 
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		//printing the elements which present in an array
		System.out.println("Your Array Elements Are.....");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		//logic for printing prime numbers
		System.out.println("Your Prime numbers That Are Present In Array");
		for(int i=0;i<=arr.length-1;i++) 
		{
			boolean isPrime=true;
			if(arr[i]==1 || arr[i]==0) 
			{
				isPrime=false;
			}
			else 
			{
				for(int j=2;j<arr[i];j++) 
				{
					if(arr[i]%j==0) 
					{
						isPrime=false;
						break;
					}
				}
			}
			if(isPrime==true) 
			{
				System.out.print(arr[i]+" ");
			}
		}
		scanner.close();
	}


}

