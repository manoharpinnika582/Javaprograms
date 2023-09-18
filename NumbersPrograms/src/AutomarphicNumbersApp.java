import java.util.Scanner;

public class AutomarphicNumbersApp {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Number");
int n=scanner.nextInt();
//Object Creation
AutomarphicNumber aT=new AutomarphicNumber();
int res=aT.cheking(n);
//compare num with last digit of the variable square  
if(n==res) {
	System.out.println("Your Number is Automarphic Number");
}
else {
	System.out.println("Your Number Is NOt Automorphic");
}
	}

}
