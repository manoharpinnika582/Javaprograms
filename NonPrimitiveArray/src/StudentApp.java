import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Sudents Objects:");
		Student arr[]= new Student[scanner.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Id:");
			int id=scanner.nextInt();
			System.out.println("Enter Name:");
			scanner.nextLine();
			String name=scanner.nextLine();
			System.out.println("Enter Marks:");
			int marks=scanner.nextInt();
			arr[i]=new Student(id, name, marks);
		}
		while(true) {
		StudentSearchSort.studentPrintArray(arr);
		System.out.println();
		System.out.println("Enter A Student Name to Search:");
		scanner.nextLine();
		String nameKey=scanner.nextLine();
		boolean res=StudentSearchSort.studentLinearSearch(arr, nameKey);
		if(!res)
			System.out.println("Student Name is Not Found..");
		
		
		
		
		System.out.println();
		System.out.println("Enter true if you wish to sort else false:");
		boolean ch=scanner.nextBoolean();
		if(ch)
			StudentSearchSort.studentBobbleSorting(arr);
		
		StudentSearchSort.studentPrintArray(arr);
		System.out.println();
		System.out.println("Enter A Student Id to Search:");
		int id=scanner.nextInt();
		res=StudentSearchSort.studentBinarySearch(arr, id);
		if(!res)
		{
			System.out.println("Student Name is Not Found..");
		}
		
		System.out.println();
		System.out.println("Here to Select One Sorting Method:");
		System.out.println("1====>Bobble Sorting.");
		System.out.println("2====>Insertion Sorting.");
		System.out.println("3====>Selection Sorting.");
		System.out.println("Here to Enter Your Choice.");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Your Choosing Bobble Sorting");
			StudentSearchSort.studentBobbleSorting(arr);
			StudentSearchSort.studentPrintArray(arr);
			break;
		case 2:
			System.out.println("Your Choosing Insertion Sorting");
			StudentSearchSort.studentInsertionSorting(arr);
			StudentSearchSort.studentPrintArray(arr);
			break;
		case 3:
			System.out.println("Your Choosing Selection Sorting");
			StudentSearchSort.studentBobbleSorting(arr);
			StudentSearchSort.studentPrintArray(arr);
			break;
		default:
			System.out.println("Your Are Going Out Of Choices....");
		}
		
			
		System.out.println();
		System.out.println("Thanks for Rating With us ...Out of 10:");
		int rating=scanner.nextInt();
		StudentSearchSort.studentRatingApplication(rating);
		
		System.out.println("Enter true if you Wish To Continue with my Application..else false");
		boolean again=scanner.nextBoolean();
		if(again==false) {
			System.out.println("Thank you for Using my Appliation...");
			return;
		}
		}
	}

}
