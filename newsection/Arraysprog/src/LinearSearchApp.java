import java.util.Scanner;

public class LinearSearchApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scanner.nextInt()];
		System.out.println("Enter "+arr.length+" Elements Stored into an Array");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scanner.nextInt();
		}
		//printing the values
		System.out.println("Your Are Elements Are....");
		for (int x : arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter a Key To Search");
		int key=scanner.nextInt();
		LinearSearch linearSearch=new LinearSearch();
		int res=linearSearch.findKey(arr, key);

		if(res>=0) 
		{
			System.out.println("Key is Found At : "+res);
		}
		else 
		{
			System.out.println("Key is Not Found...");
		}
	}
}
