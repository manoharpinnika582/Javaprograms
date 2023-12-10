import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
//String s=scanner.nextLine();
//System.out.println(s);
//
//
//StringBuilder str=new StringBuilder("Manohar");
//System.out.println(str);
//System.out.println(str.reverse());
System.out.println("Enter Array Size");
		char [] arr1=new char[scanner.nextInt()];
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scanner.next().charAt(0);
		}
		System.out.println("Your Charecters Are.....");
		for (char c : arr1) {
			System.out.print(c+" ");
		}
		System.out.println("=========================");
		char []arr2= new char[arr1.length];
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Copying Array is....");
		for (char y : arr2) {
			System.out.print(y+" ");
		}
		System.out.println();
		char [] arr3=new char[arr2.length];
		for(int i=0;i<=arr2.length-1;i++) {
			arr3[i]=arr2[i];
		}
		System.out.println("Copy and Reversed Array...");
		for(int i=arr3.length-1;i>=0;i--) {
			System.out.print(arr3[i]+" ");
		}
		
		

}

}
