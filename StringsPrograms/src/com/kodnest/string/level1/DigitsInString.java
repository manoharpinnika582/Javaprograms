package com.kodnest.string.level1;

public class DigitsInString {
	static void findDigit(String str)
	{
		int count=0;
		if(str!=null || str!=" ")
		{	
		for(char c:str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				count++;
				System.out.print(c);
			}
		}
		System.out.print(" : "+count);
		}
		
	}
}
