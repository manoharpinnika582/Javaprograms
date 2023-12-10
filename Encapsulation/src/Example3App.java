import java.util.Scanner;

public class Example3App {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Student id:");
	int id=scanner.nextInt();

	System.out.println("Enter Student Name:");
	scanner.nextLine();
	String name=scanner.nextLine();
	
	System.out.println("Enter Student Marks:");
	int marks=scanner.nextInt();
	
	System.out.println("Enter Student Gender:");
	scanner.nextLine();
	String gender=scanner.nextLine();
	
	Example3 theExample3=new Example3(id, name, marks, gender);
	
	System.out.print(theExample3.getId()+" "+theExample3.getName()+" "+theExample3.getMarks()+" "+theExample3.getGender());
	
	scanner.close();

}
}
