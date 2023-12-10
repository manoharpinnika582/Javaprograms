
public class ComapreStringsEXample2 {

	public static void main(String[] args) {
		String s1="MANU";
		String s2=new String("MANU");
		if(s1==s2) {
			System.out.println("References Are Equals");
		}
		else {
			System.out.println("References Are  Unequals");
		}
		if(s1.equals(s2)) {
			System.out.println("String Contents  Are Equals");
		}
		else {
			System.out.println(" String Are  Unequals");
		}
	}

}
