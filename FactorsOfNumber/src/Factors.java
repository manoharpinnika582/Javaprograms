import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to find their Factors");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			{
				System.out.println("Factors of "+n+" is "+i);
			}
		}
		scanner.close();

	}

}
