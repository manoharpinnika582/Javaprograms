package com.kodnest.string.level1;

public class ReverseEachWord {
	void reverseWord(String str) {
		String []wordarr=str.split(" ");
		String revString="";
		for(int i=0;i<=wordarr.length-1;i++) {
			String word=wordarr[i];
			char []wa=word.toCharArray();
			char []rwa=new char[wa.length];
			int j=rwa.length-1;
			for(int k=0;k<=wa.length-1;k++) {
				rwa[j]=wa[k];
				j--;
			}
			String revWord=new String(rwa);
			revString+=revWord+" ";
		}
		System.out.println("reversed word is: "+revString);
	}
}
