package stu.manohar.training.nestedloops;

public class NestedIfElseIfElse {

	public static void main(String[] args) {
		int s=8;
		int i=6;
		int r=4;
		int ii=2;
		if(s<i) {//This condition is fail ----the control goes inside the else block
			System.out.println(s+"is lessthan"+i);
		}
		else {//control see the else block---after control see the if block ---control goes to if block
			if(r<ii) {//condition check will check the ----condition fails ---the control will goes out off if block--
				System.out.println(r+"    is lessthan"+ii);
			}
			else {//control goes inside the else block-----it will printed on the monitor----
				System.out.println("          The above all conditions are fails");
			}
		}

	}

}
