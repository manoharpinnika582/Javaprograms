import java.util.Scanner;

public class Example1App {
public static void main(String[] args) {
	Example1 theExample1=new Example1();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Temparature:");
	int t=scanner.nextInt();
	theExample1.setTemparature(t);
	System.out.println("The Temparature is: "+theExample1.getTemparature());
	scanner.close();
}
}
