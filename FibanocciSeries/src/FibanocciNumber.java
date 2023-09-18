import java.util.Scanner;

public class FibanocciNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number To calculate Fibanocci Series ");
		int n=scan.nextInt();
		Series series=new Series();
		series.fibanocciSeries(n);

		scan.close();
	}
	
	}
	


