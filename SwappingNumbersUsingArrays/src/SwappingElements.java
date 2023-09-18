import java.util.Scanner;

public class SwappingElements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int arr[]=new int [scanner.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Before Swapping of Elemnts is "+arr);
		for(int i:arr) {
			 
			System.out.print((i)+" ");
			}
		System.out.println();
		System.out.println("Enter Two Index Values to Swapping....");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
			int temp = 0;
		temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
		
	for (int i : arr) {
		System.out.print(i+" ");
	}
		
			
				
				
	
	}
}
