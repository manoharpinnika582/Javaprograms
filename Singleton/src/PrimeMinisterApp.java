
public class PrimeMinisterApp {
	public static void main(String[] args) {
		//PrimeMinister minister=new PrimeMinister("Modi", 74, "Male");
		//PrimeMinister minister1=new PrimeMinister("Modi", 74, "Male");
		PrimeMinister pm=PrimeMinister.getInstance();
		PrimeMinister pm1=PrimeMinister.getInstance();
		System.out.println(pm);
		System.out.println(pm1);
	}
}
