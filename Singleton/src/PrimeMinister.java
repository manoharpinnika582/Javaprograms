
public class PrimeMinister {
	//step 1
	static PrimeMinister pm=null;
	String name;
	int age;
	String gender;
	
	//step-2 should be in private
	private PrimeMinister(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void meatingWithCheifMinister() {
		System.out.println(name+" Prime Minister is attending meating with CM.");
	}
	
	
	
	//step-3
	static public PrimeMinister getInstance() {
		if(pm==null) {
			pm=new PrimeMinister("Modi",74,"Male");
		}
		return pm;
	}
}
