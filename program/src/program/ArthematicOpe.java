package program;
//All Arthematic Operations 
import java.util.Scanner;

public class ArthematicOpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
	    Arthematic ar=new Arthematic();
	     int a1=ar.add(a, b);
	     int s1=ar.sub(a, b);
	     int m1=ar.mul(a, b);
	     int d1=ar.div(a, b);
	     int m2=ar.mod(a, b);
	     System.out.println("The Addition result is :"+a1);
	     System.out.println("The substraction result is :"+s1);
	     System.out.println("The Multiplication result is :"+m1);
	     System.out.println("The Division result is :"+d1);
	     System.out.println("The Remainder result is :"+m2);
	     scan.close();
	}

}
