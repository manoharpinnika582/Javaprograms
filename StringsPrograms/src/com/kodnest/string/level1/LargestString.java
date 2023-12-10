package com.kodnest.string.level1;

public class LargestString {
String findLargestString(String inputString)
{
	String[] words = inputString.split(" ");
	String largestString="";
	for(String word:words)
	{
		if(word.length()>largestString.length())
		{
			largestString=word;
		}
	}
	return largestString;
}
}
