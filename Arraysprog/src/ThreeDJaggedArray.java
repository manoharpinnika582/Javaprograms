import java.util.Scanner;

public class ThreeDJaggedArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Schools");
		int arr[][][]=new int [scanner.nextInt()][][];
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.print("Enter the number of Classes in School " + i + ": ");
			arr[i]=new int[scanner.nextInt()][];
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print("Enter the Number of Students in the Class "+j+" in School " + i + ": ");
				arr[i][j]=new int[scanner.nextInt()];
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print("Enter the Marks of Student "+k+" in the Class "+j+" in School " + i + ": ");
					arr[i][j][k]=scanner.nextInt();
				}
				System.out.println();
			}
			System.out.println();
		}
		//printing the array elements
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
