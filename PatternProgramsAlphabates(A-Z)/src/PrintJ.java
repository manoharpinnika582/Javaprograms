import java.util.Scanner;

public class PrintJ {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a odd number to visible clearly more than 4");
		int n=scanner.nextInt();
		int mid=Math.ceilDiv(n,2);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {				
				if((j==1 & i>=mid) || j==mid || (i==n & j<=mid)|| i==1){
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
