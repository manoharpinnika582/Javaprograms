import java.util.Scanner;

public class SumOfNumbersApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		SumOfNnaturalNumbers sum=new SumOfNnaturalNumbers();
		System.out.println(sum.sumOfNaturals(num));
		scan.close();
	}
	

}
