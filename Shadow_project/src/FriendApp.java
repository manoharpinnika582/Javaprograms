import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		System.out.println("Enter your Phone number");
		long phone=sc.nextLong();
		System.out.println("Enter your E-mail");
		sc.nextLine();
		String email=sc.nextLine();
		System.out.println("Enter your Address");
		String address=sc.nextLine();
		System.out.println("Do you have building");
		boolean house=sc.nextBoolean();
		System.out.println("Do you have a lover");
		boolean have_lover=sc.nextBoolean();
		System.out.println("Do you have a mobile");
		boolean mobile=sc.nextBoolean();
		System.out.println("Do you have a bike");
		boolean bike=sc.nextBoolean();
		System.out.println("Do you have a job");
		boolean job=sc.nextBoolean();
		System.out.println("Enter your salary");
		int salary=sc.nextInt();
		Friend f=new Friend(name, phone, address, email, house, have_lover, mobile, bike, job, salary);
		f.eating();
		f.talking();
		sc.close();
	}

}
