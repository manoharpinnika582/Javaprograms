package com.kodnest.practise;

public class Section2 {
	public static void main(String[] args) {
		int a=10,b=0;
		byte d=(byte) 40.04;
		//double d1=40.04;
		char c='k';
		long l=(long)44.567891;
		//double d2=44.567891;
		int s=b+a;
		//byte k=(byte) ((byte)s++ + ++s +5);
		int k=s++ + ++s +5;
		System.out.println(k);
	}
}
