package learn.manohar.kodnest.sortingseraching;

import java.util.Scanner;

public class LinearSearchElementApp {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Array Size");
int arr[]=new int[scanner.nextInt()];
System.out.println("Enter "+arr.length+" elmenents Stored in Array");
for(int i=0;i<=arr.length-1;i++) {
	arr[i]=scanner.nextInt();
}
System.out.println("Enter a key to Find it is present or Not");
int key=scanner.nextInt();
LinearSearchElement searchElement=new LinearSearchElement();
int index=searchElement.findKey(arr, key);
if(index>=0) {
	System.out.println("Key Is Found at "+index);
	return;
}
else {
	System.out.println("Key not Found");
}

	}

}
