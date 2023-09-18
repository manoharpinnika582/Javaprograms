import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No.of Students You Have:");
		Student arr[]=new Student[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter ID:");
			int id=scan.nextInt();
			System.out.println("Enter Name:");
			scan.nextLine();
			String name=scan.nextLine();
			System.out.println("Enter Marks:");
			int marks=scan.nextInt();
			arr[i]=new Student(id,name,marks);
		}
		Student.studentArrayContent(arr);
		System.out.println("Enter a Name to Search :");
		scan.nextLine();
		String name=scan.nextLine();
		Student.linearSearch(arr, name);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Enter a id to search");
		int key=scan.nextInt();
		Student.binarySearch(arr, key);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Do you want to Sorting id's ?");
		System.out.println("Enter true or false");
		boolean sort=scan.nextBoolean();
		Student.sorting(arr, sort);
		
		System.out.println("Enter your Rating With Us...Out of 10");
		int noo=scan.nextInt();
		Student.studentAppRating(noo);
	}

}
