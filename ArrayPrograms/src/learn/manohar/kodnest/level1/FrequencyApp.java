package learn.manohar.kodnest.level1;

import java.util.Scanner;

public class FrequencyApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elments Stored in Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		int res[]=Frequency.findFrequency(arr);
		System.out.println();
		System.out.println("Elments"+"  "+"Frequency  ");
		System.out.println("-----------------------------");
		for(int i=0;i<=res.length-1;i++) {
			if(res[i]!=-1) {
				System.out.println("   "+arr[i]+"  |  "+res[i]);
			}
		}

	}
}
