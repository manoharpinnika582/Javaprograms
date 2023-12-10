import java.util.Scanner;

public class RotatingArrayRight {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scanner.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scanner.nextInt();
		}
		System.out.println("Your Array ELements Are.....");
		for (int x : arr) {
			System.out.print(x+"");
		}	
		System.out.println("Enter A Number How Many Times to Rotate");
		int n=scanner.nextInt();
		rightRotate(arr,n);
	}
	static void rightRotate(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int last=arr[arr.length-1];
			int j;
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println();
		System.out.println("After Rotating The Elments");
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}

}
