import java.util.Scanner;

public class GalaticArthematic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long result=galacticAddition(num1, num2);
		System.out.println(result);
		scan.close();

	}
	public static long galacticAddition(long num1,long num2) {
		return num1+num2;
	}

}
