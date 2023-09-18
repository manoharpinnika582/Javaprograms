import java.util.Scanner;

public class PrintP {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if( (i==1 & j<n)|| j==1 || (i==Math.ceilDiv(n, 2) & j<n) || j==n & (i>1 &i<Math.ceilDiv(n, 2))) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		scanner.close();

	}

}
