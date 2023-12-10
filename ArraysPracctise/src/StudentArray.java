
public class StudentArray {
	static String name;
	static int age;
	static int marks;
	
	public StudentArray(String name,int age,int marks) {
		StudentArray.name=name;
		StudentArray.age=age;
		StudentArray.marks=marks;
	}

	public static void printElements(StudentArray arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks);
		}
	}
}
