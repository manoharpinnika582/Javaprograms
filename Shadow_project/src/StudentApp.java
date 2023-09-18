import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your register number");
		int regNum=sc.nextInt();
		System.out.println("Enter your name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter your branch");
		String branch=sc.nextLine();
		System.out.println("Enter your Course");
		String course=sc.nextLine();
		System.out.println("Enter your E-mail address");
		String email=sc.nextLine();
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		System.out.println("Enter your Phone");
		long phone=sc.nextLong();
		System.out.println("Do you have a lover(true or false)");
		boolean have_lover=sc.nextBoolean();
		System.out.println("Enter your Room number");
		int room_num=sc.nextInt();
		System.out.println("Enter your Bench number");
		int bench_num=sc.nextInt();
		Student s=new Student(regNum, name, branch, course, email, age, phone, have_lover, room_num, bench_num);
		s.study();
		s.playing();
		sc.close();
		
		
		

	}

}
