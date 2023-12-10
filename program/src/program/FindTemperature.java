package program;

import java.util.Scanner;

public class FindTemperature {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Fahrenheit to calculate temparature");
		float temp=scan.nextFloat();
		Temparature t1=new Temparature();
		float calsin=t1.tempFind(temp);
		System.out.println("The temparature is :"+calsin);
		
	}

}
