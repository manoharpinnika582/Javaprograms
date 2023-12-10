import java.util.Scanner;

public class QueueApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Queue size");
		try {
			int n=scanner.nextInt();
			Queue q=new Queue(n);
			while(true) {
				System.out.println("Press 1----->insert");
				System.out.println("Press 2----->delete");
				System.out.println("Press 3----->display");
				System.out.println("Enter Any number----->stop");
				System.out.println("Enter Your Choice Here");
				int choice=scanner.nextInt();
				switch(choice) {
				case 1:q.insert();
						break;
				
				case 2: q.delete();
						break;
				
				case 3: q.display();
						break;
				default:
					System.out.println("Thanks for Using My Queue Implementation");
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
