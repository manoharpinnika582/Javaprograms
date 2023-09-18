package stu.manohar.training.nestedloops;

public class NestedIFElse {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=10;
		if(b>a) {//control check the condition if the condition is true --the control goes inside the if block other wise----control will directly goes the else block 
			System.out.println("b="+b+" "+"a="+a+" "+"B is greater-than A");
			if(c>b) {//if the condition is true execute if block ----other wise control will goes to inside if----else block
				System.out.println("   c="+c+" "+"b="+b+" "+"C is greater-than B");
			}
			else {
				System.out.println("        c="+c+" "+"b="+b+"C is Lesser-than B");
			}
		
		}
		else {
			System.out.println("b="+b+" "+"a="+a+" "+"B is Lesser-than A");
		}

	}

}
