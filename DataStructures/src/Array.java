import java.util.Scanner;

public class Array {
	
	private int arr[];
	private Scanner scanner=new Scanner(System.in);
	public Array(int n) {
		arr=new int[n];
	}
	
	public void insert() {
		try {
			System.out.println("Your Are inserted Between 0 to "+(arr.length-1));
			System.out.println("Enter Your Position to Insert The Value");
	   		int pos=scanner.nextInt();
			System.out.println("Enter Your Element to Insert");
			int elem=scanner.nextInt();
			arr[pos]=elem;
			System.out.println("Inserted Successfully!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		try {
			System.out.println("Enter Your Position to DELETE The Value");
			int pos=scanner.nextInt();
			System.out.println("Your deleted element is "+arr[pos]);
			arr[pos]=0;
			System.out.println("Deleted Successfully!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void display() {
		try {
			System.out.println("+++++++++++++++++++++++++++");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("+++++++++++++++++++++++++++");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
