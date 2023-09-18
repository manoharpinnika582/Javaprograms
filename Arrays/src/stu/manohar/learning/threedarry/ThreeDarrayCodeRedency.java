package stu.manohar.learning.threedarry;

import java.util.Scanner;

public class ThreeDarrayCodeRedency {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int [][][]arr=new int[scan.nextInt()][][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print("Enter the number of subjects for student " + (i + 1) + ": ");
			arr [i]=new int[scan.nextInt()][];
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=new int [scan.nextInt()];
				 System.out.print("Enter the number of assignments for student " + (i + 1) +
                         " subject " + (j + 1) + ": ");
				for(int k=0;k<=arr[i][j].length-1;k++){
					System.out.print("Enter grade for student " + (i + 1) +
                            " subject " + (j + 1) +
                            " assignment " + (k + 1) + ": ");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}


		arr[0][0]=new int[3];
		arr[0][1]=new int[4];
		arr[0][2]=new int[2];

		arr[1][0]=new int[4];
		arr[1][1]=new int[3];

		arr[2][0]=new int[2];
		arr[2][1]=new int[3];
		arr[2][2]=new int[1];
		arr[2][3]=new int[2];

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter Student Marks "+i+" Class"+j+" Student"+k);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array Contents Are........");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();

	}

}
