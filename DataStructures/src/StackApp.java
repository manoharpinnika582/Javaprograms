import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter stack size");
		try {
			int n=scanner.nextInt();
			Stack s=new Stack(n);
			while(true) {
				System.out.println("Press 1----->push");
				System.out.println("Press 2----->pop");
				System.out.println("Press 3----->display");
				System.out.println("Enter Any number----->stop");
				System.out.println("Enter Your Choice Here");
				int choice=scanner.nextInt();
				switch(choice) {
				case 1:s.push();
						break;
				
				case 2: s.pop();
						break;
				
				case 3: s.display();
						break;
				default:
					System.out.println("Thanks for Using My stacks Implementation");
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
