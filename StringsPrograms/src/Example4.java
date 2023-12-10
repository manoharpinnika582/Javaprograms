
public class Example4 {

	public static void main(String[] args) {
		String s1="MANU";
		String s2="SRINU";
		String s3= "MANU"+"SRINU";
		String s4= "MANU"+"SRINU";
		if(s3==s4) {
			System.out.println("References Are Equals");
		}
		else {
			System.out.println("References Are  Unequals");
		}
		if(s3.equals(s4)) {
			System.out.println("String Contents  Are Equals");
		}
		else {
			System.out.println(" String Are  Unequals");
		}
	}

}
