package com.kodnest.string.level1;

import java.util.Scanner;

public class PreserveWhiteSpaces {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter A String line");
	String str=scanner.nextLine();
	char arr[]=str.toCharArray();
	char revArr[]=new char[arr.length];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==' ')
		{
			revArr[i]=arr[i];
		}
	}
	int j=revArr.length-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=' ')
		{
			if(arr[j]==' ')
			{
				j--;
			}
			revArr[j]=arr[i];
			j--;	
		}
		
	}
	String rev=new String(revArr);
	System.out.print(rev);
}
}
