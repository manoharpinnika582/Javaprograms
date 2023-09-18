
public class Student {
	int regNum;
	String name;
	String branch;
	String course;
	String email;
	int age;
	long phone;
	boolean have_lover;
	int room_num;
	int bench_num;
	public Student(int regNum, String name, String branch, String course, String email, int age, long phone,
			boolean have_lover, int room_num, int bench_num) {
		super();
		this.regNum = regNum;
		this.name = name;
		this.branch = branch;
		this.course = course;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.have_lover = have_lover;
		this.room_num = room_num;
		this.bench_num = bench_num;
	}
	void study() {
		System.out.println(name+" "+branch+" "+course+" "+"is sleeping in the class room");
	}
	void playing() {
		System.out.println(regNum+" "+name+" "+age+" "+" is plying cricket in the ground");
	}

}
