package stu.manohar.training.nestedloops;

public class NestedIf {

	public static void main(String[] args) {
		 int a=90;
		 int b=70;
		 int c=50;
		 if(a>b) {//control will check the condition if condition is true go to next if block---before whatever there is in if block that statement will be executed 
			 System.out.println("Marks get"+a+"He is get A+ Grade");
			 if(b>c) {//control will check the condition if condition is true go to next if block---before whatever there is in if block that statement will be executed
				 System.out.println("        Marks get"+b+"He is get B Grade ");
				 if(a>c) {//control will ckeck the condition if condition is true go to next if block---before whatever there is in if block that statement will be executed
					 System.out.println("           Marks get"+c+"He is get D Grade ");
				 }
			 }
		 }
	}

}




 
