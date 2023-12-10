import java.util.Scanner;

public class BinaryToDecimal {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Binary Value:");
	int num=scanner.nextInt();
	int rem;
	String add="";
	while(num>0) {
		rem=num%2;
		add=add+rem;
		num/=2;
	}
	for(int i=add.length()-1;i>0;i--) {
		System.out.print(add.charAt(i));
	}
}
}
