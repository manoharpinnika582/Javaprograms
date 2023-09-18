package learn.manohar.kodnest.level6;

import java.util.Scanner;

public class Pattern2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter a Number");
	int n=scanner.nextInt();
	
	for(int i=1;i<=n;i++) {
		char ch='A';
		for(int j=1;j<=i;j++) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();
		
	}
	
}
}
