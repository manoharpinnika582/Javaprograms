package com.kodnest.string.level1;

public class StringRotation {
	boolean isRotation(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		String concate=str1+str1;
		return concate.contains(str2);
	}
}
