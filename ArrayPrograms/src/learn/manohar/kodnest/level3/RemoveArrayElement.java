 package learn.manohar.kodnest.level3;

import java.util.Scanner;

public class RemoveArrayElement {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arr1[]=new int[scanner.nextInt()];
	System.out.println("Enter "+arr1.length+" elements Stored in Array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scanner.nextInt();
		}
		System.out.println("Enter the index of the Element You Want To Remove");
		while(true) {
        int index = scanner.nextInt();
        if (index < 0 || index >= arr1.length) {
            System.out.println("Invalid index. Index must be between 0 and " + (arr1.length - 1));
        } else {
            int arr2[] = new int[arr1.length - 1];
            int j = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (i != index) {
                    arr2[j++] = arr1[i];
                }
            }
            System.out.println("Array after removing the element:");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
            return;
        }
		
	}
	}
}


