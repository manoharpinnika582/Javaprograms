import java.util.Scanner;

public class PrintF {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a odd number to visible clearly more than 4");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {				
				if(i==1 || i==Math.ceilDiv(n,2)|| j==1){
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
