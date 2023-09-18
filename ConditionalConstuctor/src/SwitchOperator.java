import java.util.Scanner;

public class SwitchOperator {
public static void main(String[] args) {
	Scanner scan=new  Scanner(System.in);
	System.out.println("Enter + or - or * or  / to know about operator");
	char opt=scan.next().charAt(0);
	switch(opt) {
	case '+':
		System.out.println("Addition operator");
		break;
	case '-':
		System.out.println("Substraction operator");
		break;
	case '*':
		System.out.println("Multiplication operator");
		break;
	case '/':
		System.out.println("Divition operator");
		break;
		default:
			System.out.println("Idiot pls see the msg carefully");
	scan.close();
	}
}
}
