import java.util.Scanner;

public class CircularQueue {
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	private Scanner scanner=new Scanner(System.in);
	
	public CircularQueue(int n) {
		cq=new int[n];
		size=cq.length;
	}
	
	public void insert() {
		try {
			if(count==size) {
				System.err.println("Insertion is not possible,because CircularQueue is full!!!");
			}
			else {
				System.out.println("Enter an element to Insert");
				int elem=scanner.nextInt();
				r=(r+1)%size;
				cq[r]=elem;
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		try {
			if(count==0) {
				System.err.println("Deletion not possible,because CircularQueue is empty!!!");
			}
			else {
				System.out.println("Element deleted is "+cq[f]);
				f=(f+1)%size;
				count--;
			}
		} catch (Exception e) {
			
		}
	}
	
	public void display() {
		try {
			if(count==0) {
				System.err.println("Display not possible,because CircularQueue is empty!!!");
			}
			else {
				int f1=f;
				for(int i=0;i<=count;i++) {
					System.out.print(cq[f1]+" ");
					f1=(f1+1)%size;
				}
				System.out.println();
			}
		} catch (Exception e) {
			
		}
	}
}
