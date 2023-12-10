import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1D Array Array Length");
		int a=scanner.nextInt();
		System.out.println("Enter 2D Array Array Length");
		int b=scanner.nextInt();
		System.out.println("Enter 3D Array Array Length");
		int c=scanner.nextInt();
		double arr[][][]=new double[a][b][c];
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				for(int k=0;k<=arr[i][j].length-1;k++) 
				{
					System.out.println("Enter the Elements Stored in Array "+i+" "+j+" "+k);
					arr[i][j][k]=scanner.nextDouble();
				}
			}
		}
		System.out.println("Your Array Contents Are...");
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
