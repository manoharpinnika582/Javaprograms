import java.util.Scanner;

public class TwoDJaggedArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number Of Classes");
		double arr[][]=new double[scanner.nextInt()][];
		//creation of Jagged Array
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.println("Enter Number of Students in Class "+i);
			arr[i]=new double[scanner.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++) 
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				System.out.println("Enter Marks of Student Number "+j+" in Class : "+i);
				arr[i][j]=scanner.nextDouble();
			}
		}
		System.out.println("Your Jagged Array elements Are...");
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
