import java.util.Scanner;

public class StudentArrayApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("Enter number of students present in class");
		StudentArray arr[]=new StudentArray[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter name:");
			String name=scanner.next();
			System.out.println("Enter age:");
			int age=scanner.nextInt();
			System.out.println("Enter marks:");
			int marks=scanner.nextInt();
			arr[i]=new StudentArray(name,age,marks);
		}
		StudentArray.printElements(arr);
	}
}
