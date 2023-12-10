package com.kodnest.string.level1;

public class RepeatedString {
public void findRepeatedString(String repeated) {
	String[] repWord = repeated.split(" ");
	for(int i=0;i<repWord.length;i++) 
	{
		
		int count=1;
		
		for(int j=i+1;j<repWord.length;j++) {
			if(repWord[i].equalsIgnoreCase(repWord[j]))
			{
			   count++;
				repWord[j]=null;
			}
			
		}
		if(repWord[i]!=null)
		{
			System.out.println(repWord[i]+ " : "+count);
		}
	}
	
}
}
