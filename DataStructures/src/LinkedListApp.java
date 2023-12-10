import java.util.Scanner;

public class LinkedListApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			LinkedList ll=new LinkedList();
			while(true) {
				System.out.println("Press 1----->insertrear");
				System.out.println("Press 2----->deleterear");
				System.out.println("Press 3----->insertfront");
				System.out.println("Press 4----->deletefront");
				System.out.println("Press 5----->insertAtIndex");
				System.out.println("Press 6----->deleteAtIndex");
				System.out.println("Press 7----->display");
				System.out.println("Enter Any number----->stop");
				System.out.println("Enter Your Choice Here");
				int choice=scanner.nextInt();
				switch(choice) {
				case 1:ll.insertrear();;
						break;
				
				case 2: ll.deleterear();;
						break;
				
				case 3: ll.insertfront();;
						break;
				case 4:ll.deletefront();
						break;
				case 5:ll.insertAtIndex();
						break;
				case 6:ll.deleteAtIndex();
						break;
				case 7:ll.display();
						break;
						
				default:
					System.out.println("Thanks for Using My Single LinkedList Implementation");
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
