package learnt.manohar.twodarrays;

import java.util.Scanner;

public class GameScore {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  a Number  ");
		int arr[][]=new int [scan.nextInt()][];
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("Enter 2d length for 1st "+i);
			arr[i]=new int[scan.nextInt()];
		}
		 for(int i=0;i<=arr.length-1;i++) {
        	 for(int j=0;j<=arr[i].length-1;j++) {
        		 System.out.println("Enter Game Name");
        		 String game=scan.next();
        		 System.out.println("Game name"+game+" "+i+ "player Player "+j);
        		 arr[i][j]=scan.nextInt();
        	 }
         }
        	 System.out.println("Array Contents Are....");
        	 for(int i=0;i<=arr.length-1;i++) {
            	 for(int j=0;j<=arr[i].length-1;j++) {
            		 System.out.print(arr[i][j]+" ");
            	 }
            	 System.out.println();
         }
		
		scan.close();
	}

}
