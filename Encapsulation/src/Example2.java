
public class Example2 {
	private int id;
	private String name;
	private int marks;
	private String gender;
	public void setId(int id) {
		if(id>0)
			this.id = id;
		else
			System.out.println("Invalid Your ID....");
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<101)
			this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setGender(String gender) {
		String x="male";
		String y="female";
		String z="other";
		if(gender.equalsIgnoreCase(x))
			this.gender = gender;
		else if(gender.equalsIgnoreCase(y))
			this.gender = gender;
		else if(gender.equalsIgnoreCase(z))
			this.gender = gender;
		else
			System.out.println("Invalid Gender:");
	}
	public String getGender() {
		return gender;
	}
}
