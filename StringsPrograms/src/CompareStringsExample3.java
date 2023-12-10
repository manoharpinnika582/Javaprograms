
public class CompareStringsExample3 {

	public static void main(String[] args) {
		String s1="MANU";
		String s3="manu";
		String s2=new String("Manu");
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
			System.out.println("String Are Not Equals");
		}
		if(s1==s3) {
			System.out.println("References Are Equals");
		}
		else {
			System.out.println("References Are Not Equals");
		}
	
	}

}
