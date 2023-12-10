import java.util.Scanner;

public class Stack {
	private int s[];
	private int size;
	private int top=-1;
	private Scanner scanner=new Scanner(System.in);

	public Stack(int n) {
		s=new int[n];
		size=s.length;
	}

	public void push() {
		try {
			int elem;
			if(top==size-1) {
				System.out.println("Push is not posible");
			}
			else {
				System.out.println("Enter an Element");
				elem=scanner.nextInt();
				++top;
				s[top]=elem;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pop() {
		if(top==-1) {
			System.out.println("Deletion is not possible bcs there is no data");
		}
		else {
			System.out.println("Element is deleted "+s[top]);
			--top;
		}
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty displsy not ppsible");
		}
		else {
			for(int i=0;i<=top;i++) {
				System.out.print(s[i]+" ");
			}
		}
	}
}
