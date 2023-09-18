import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter A number To Check It Is Armstrong Number or Not");
	int n=scanner.nextInt();
	ArmsrongNumber armsrongNumber=new ArmsrongNumber();
	int res=armsrongNumber.findArmstrongNumber(n);
	if(n==res) {
		System.out.println("Entered Number Is Armstrong");
	}
	else {
		System.out.println("Entered Number Is Not Armstrong");
	}
	scanner.close();
	
	}

}
