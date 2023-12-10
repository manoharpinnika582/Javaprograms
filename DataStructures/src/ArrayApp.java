import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter Array Size");
			int n=scanner.nextInt();
			Array arr=new Array(n);
			while(true) {
				System.out.println("Press 1----->insert");
				System.out.println("Press 2----->delete");
				System.out.println("Press 3----->display");
				System.out.println("Enter Any number----->stop");
				System.out.println("Enter Your Choice Here");
				int choice=scanner.nextInt();
				switch(choice) {
				case 1:arr.insert();
						break;
				
				case 2: arr.delete();
						break;
				
				case 3: arr.display();
						break;
				default:
					System.out.println("Thanks for Using My Array Implementation");
					System.exit(0);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
	}
}
