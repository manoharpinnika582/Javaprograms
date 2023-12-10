package com.kodnest.string.mutable;

public class Mutable {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Rama");
		System.out.println(sb);
		System.out.println("=============================");
		sb.append(" Sita");
		System.out.println(sb);
		System.out.println();
		StringBuilder strb=new StringBuilder("Ravana");
		System.out.println(strb);
		System.out.println("=============================");
		strb.append(" Asura");
		System.out.println(strb);
	}

}
