import java.util.Scanner;

public class DoublyLinkedListApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			DoublyLinkedList dll=new DoublyLinkedList();
			while(true) {
				System.out.println("Press 1----->insertrear");
				System.out.println("Press 2----->deleterear");
				System.out.println("Press 3----->insertfront");
				System.out.println("Press 4----->deletefront");
				System.out.println("Press 5----->insertAtIndex");
				System.out.println("Press 6----->deleteAtIndex");
				System.out.println("Press 7----->displayforward");
				System.out.println("Press 8----->displayreverse");
				System.out.println("press 9----->stop");
				System.out.println("Enter Your Choice Here");
				int choice=scanner.nextInt();
				switch(choice) {
				case 1:dll.insert_rear();;
						break;
				
				case 2: dll.delete_rear();;
						break;
				
				case 3: dll.insert_front();;
						break;
				case 4:dll.delete_front();
						break;
				case 5:dll.insertAtIndex();
						break;
				case 6:dll.deleteAtIndex();
						break;
				case 7:dll.display_forward();
						break;
				case 8:dll.display_reverse();
						break;
				default:
					System.out.println("Thanks for Using My Doubly LinkedList Implementation");
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
