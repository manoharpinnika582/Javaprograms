package learn.manohar.kodnest.level3;

import java.util.Scanner;

public class BinarySearchKeyApp 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elments to Store in Array ");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Key To Search It Is Present Or Not");
		int key=scan.nextInt();
		BinarySearchKey binarySearchKey=new BinarySearchKey();
		boolean res=binarySearchKey.searchKey(arr, key);
		if(res==true) 
		{
			System.out.println("Key Is Found");
			return;
		}
		else
		{
			System.out.println("Key Is Not Found");
		}
	}

}
