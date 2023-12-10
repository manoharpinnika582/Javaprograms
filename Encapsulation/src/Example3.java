
public class Example3 {
	private int id;
	private String name;
	private int marks;
	private String gender;
	
	public Example3(int id,String name,int marks,String gender)
	{
		if(id>0)
		{
		this.id=id;
		}
		else {
			System.out.println("Invalid Your ID:");
		}
		this.name=name;
		if(marks>0 && marks<101)
		{
			this.marks=marks;
		}
		else {
			System.out.println("Invalid Your Marks:");
		}
		
		this.gender=gender;
	}
	
	public int getId() {
		
		return id;
		
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String getGender() {
		return gender;
	}
}
