import java.util.Scanner;

public class CicularQueueApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter CircularQueue size");
		try {
			int n=scanner.nextInt();
			CircularQueue circularQueue=new CircularQueue(n);
			while(true) {
				System.out.println("Press 1----->insert");
				System.out.println("Press 2----->delete");
				System.out.println("Press 3----->display");
				System.out.println("Enter Any number----->stop");
				System.out.println("Enter Your Choice Here");
				int choice=scanner.nextInt();
				switch(choice) {
				case 1:circularQueue.insert();
						break;
				
				case 2: circularQueue.delete();
						break;
				
				case 3: circularQueue.display();
						break;
				default:
					System.out.println("Thanks for Using My CircularQueue Implementation");
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
