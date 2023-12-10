import java.util.Scanner;

public class Queue {
	private int q[];
	private int r=-1;
	private int f=0;
	private int size;
	private Scanner scanner=new Scanner(System.in);
	
	public Queue(int n) {
		q=new int[n];
		size=q.length;
	}
	
	public void insert() {
		try {
			int elem;
			if(r==size-1) {
				System.out.println("Insertion not Possible,Queue is Full!!");
			}
			else {
				System.out.println("Enter an element to insert");
				elem=scanner.nextInt();
				++r;
				q[r]=elem;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		try {
			if(r==-1 || f>r) {
				System.out.println("Deletion is not possible!!!");
			}
			else {
				System.out.println("Element deleted is "+q[f]);
				++f;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void display() {
		if(r==-1 || f>r) {
			System.out.println("Display is not possible!!!!");
		}
		else {
			for(int i=f;i<=r;i++) {
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}
	
}
