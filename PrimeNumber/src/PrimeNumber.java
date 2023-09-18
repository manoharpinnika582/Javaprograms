import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to check it is Primte or Not");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<2) {
			System.out.println("Not a Prime");
		}
		else {
			for(int i=2;i<=n;i++) {
				if(n%i!=0) {
					System.out.println(" Prime");
				}
				else {
					System.out.println("Is  not Prime");
				}
			}
		}

		scan.close();

	}

}
