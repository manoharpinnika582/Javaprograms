package learn.manohar.kodnest.practicequestions;

import java.util.Scanner;

public class CountingGrade {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
	for(int i=1;i<=num;i++) {
		if(i==5) {
			break;
		}
		else {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
		
	
}
}
