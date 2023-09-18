/* Write a java Program to create 
 * 
   an integer array by taking length 
   as input from the user . take the
   contents of the array from user 
   and store the contents in the array. 
   Display the contents of the array by 
   incrementing each value present in 
   the array by 5 on to the console.

*/

package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int arr[]=new int [scanner.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Array Contents Are.....");
		for(int i:arr) {
			System.out.print((i+5)+" ");
		}
		System.out.println();
		scanner.close();
	}

}
