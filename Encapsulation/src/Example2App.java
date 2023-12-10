import java.util.Scanner;

public class Example2App {
public static void main(String[] args) {
	Example2 theExample2=new Example2();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Student id:");
	int id=scanner.nextInt();
	theExample2.setId(id);
	System.out.println("Enter Student Name:");
	String name=scanner.next();
	theExample2.setName(name);
	System.out.println("Enter Student Marks:");
	int marks=scanner.nextInt();
	theExample2.setMarks(marks);
	System.out.println("Enter Student Gender:");
	
	String gender=scanner.next();
	theExample2.setGender(gender);
	System.out.println("Student 1:");
	System.out.println("Student id:"+theExample2.getId());
	System.out.println("Name:"+theExample2.getName());
	System.out.println("Marks:"+theExample2.getMarks());
	System.out.println("Gender:"+theExample2.getGender());
}
}
