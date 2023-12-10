
public class Example5 {

	public static void main(String[] args) {
		String s1="MANU";
		String s2="SRINU";
		String s3= s1+s2;
		String s4= s1+s2;
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
