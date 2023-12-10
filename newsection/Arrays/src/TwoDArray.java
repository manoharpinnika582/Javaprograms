import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1D Array and 2D Array Length");
		double arr[][]=new double[scanner.nextInt()][scanner.nextInt()];
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				arr[i][j]=scanner.nextDouble();
			}
		}
		//printing the elements
		System.out.println("Your Array Contents Are.....");
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
