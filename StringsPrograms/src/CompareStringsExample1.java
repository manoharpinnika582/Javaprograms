
public class CompareStringsExample1 {

	public static void main(String[] args) {
		String s1="MANU";
		String s2="MANU";
		if(s1==s2) {
			System.out.println("References Are Equals");
		}
		else {
			System.out.println("References Are Not Equals");
		}
		if(s1.equals(s2)) {
			System.out.println("String Contents  Are Equals");
		}
		else {
			System.out.println(" String Are Not Equals");
		}
	}

}
