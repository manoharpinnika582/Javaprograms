import java.util.Scanner;

public class ArthematicOperations {

	public static void main(String[] args) {
		
		int res1=subtractNumbers(20,5);
		System.out.println(res1);
		int res2=multiplyNumbers(4,5);
		System.out.println(res2);
		double res3=divideNumbers(20,4);
		System.out.printf("%.2f\n",res3);
		int res4=findRemainder(10,3);
		System.out.println(res4);
		
	}
	public static int subtractNumbers(int num2,int num1) {
		return num2-num1;
	}
	public static int multiplyNumbers(int num1,int num2) {
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}
	public static int findRemainder(int num1,int num2) {
		return num1%num2;
	}

}
