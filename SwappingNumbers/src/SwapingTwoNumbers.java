import java.util.Scanner;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Two Numbers ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Before Swapping of Two Numbers is "+a+" and  "+b);
        //logic.......
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping of Two Numbers is "+a+" and  "+b);
	   scan.close();
	}

}
