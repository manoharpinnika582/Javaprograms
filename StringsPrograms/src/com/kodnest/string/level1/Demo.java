package com.kodnest.string.level1;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter A String line");
	String str=scanner.nextLine();
	String[] wordsArr = str.split(" ");
	String revString="";
	for(int i=0;i<wordsArr.length;i++)
	{
		
		String word=wordsArr[i];
		char wordArr[]=word.toCharArray();
		char revWordArray[]=new char[wordArr.length];
		int j=revWordArray.length-1;
		for(int k=0;k<wordArr.length;k++) {
			revWordArray[j]=wordArr[k];
			j--;
		}
		
		String revWord=new String(revWordArray);
		revString+=revWord+" ";
		
		}
		System.out.print(revString+" ");
	
	
}
}
