import java.util.Scanner;

public class ArrayContainsString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter People number ");
		int num=scan.nextInt();
		boolean []arr=new boolean[num];
		for(int i=0;i<=num-1;i++) 
		{
			System.out.println("Poeple "+i+"Married...?");
			arr[i]=scan.nextBoolean();
		}
		System.out.println("Your Peoples are.....");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.print("People "+i +"married "+arr[i]);
		}
		scan.close();
	}

}
