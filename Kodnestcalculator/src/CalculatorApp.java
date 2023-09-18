import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator calculator=new Calculator();
		while(true) {
			System.out.println("Hello user welcome to kodnest");
			System.out.println("+-----> Addition");
			System.out.println("-  -----> substraction");
			System.out.println("*-----> multiplication");
			System.out.println("/-----> divition");
			System.out.println("%-----> find reminder");
			System.out.println("!-----> Program stop");
			System.out.println("Enter your choice");
			char ch=scan.next().charAt(0);
			switch(ch) {

			case '+':
				calculator.addition();
				break;
			case '-':
				calculator.substraction();
				break;
			case '*':
				calculator.multiplication();
				break;
			case '/':
				calculator.divition();
				break;
			case '%':
				calculator.findReminder();
				break;
			case '^':
				calculator.findSquare();
				break;
			case '!':
				System.out.println("Ta Taa bye byeee see youuuuuuuu.........");
				return;
			}
			scan.close();

		}
		
	}

}
