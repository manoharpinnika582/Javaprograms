
public class Friend {
	String name;
	long phone;
	String email;
	String address;
	boolean house;
	boolean have_lover;
	boolean mobile;
	boolean bike;
	boolean job;
	int salary;
	public Friend(String name, long phone, String address, String email, boolean house, boolean have_lover,
			boolean mobile, boolean bike, boolean job, int salary) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.house = house;
		this.have_lover = have_lover;
		this.mobile = mobile;
		this.bike = bike;
		this.job = job;
		this.salary = salary;
	}
	void eating() {
		System.out.println(name+" "+"is eating");
	}
	void talking() {
		System.out.println(name+" "+phone+" "+"is talking to his friend");
	}
	
}
