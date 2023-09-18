package learnt.manohar.twodarrays;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter  a Number  ");
    int num=scanner.nextInt();
    String arr[][]=new String [num][];
    
    for(int i=0;i<num;i++) {
     arr[i]=new String[scanner.nextInt()];
	}
    scanner.nextLine();
    
    for(int i=0;i<=arr.length-1;i++) {
   	 for(int j=0;j<=arr[i].length-1;j++) {
   		 System.out.println("Enter Name of bank"+i+ " Customer "+j);
   		 arr[i][j]=scanner.nextLine();
   	 }
    }
   	 System.out.println("Array Contents Are....");
   	 for(int i=0;i<=arr.length-1;i++) {
       	 for(int j=0;j<=arr[i].length-1;j++) {
       		 System.out.print(arr[i][j]+" ");
       	 }
       	 System.out.println();
    }
    scanner.close();
	}

}
