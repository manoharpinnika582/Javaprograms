import java.util.Scanner;

public class LinkedList {
	
	class Node{
		int data;
		Node link;
	}
	private Scanner scan=new Scanner(System.in);
	private Node first;
	
	public void insertrear() {
		Node temp;
		System.out.println("Enter an Element:");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		if(first==null) {
			first=newnode;
		}
		else {
		temp=first;
		while(temp.link!=null) {
			temp=temp.link;
		}
		temp.link=newnode;
		}
	}
	
	public void deleterear() {
		Node temp;
		if(first==null) {
			System.err.println("Deletion not possible!!!");
		}
		if(first.link==null) {
			System.out.println("Element deleted is "+first.data);
		}
		else {
			temp=first;
			while(temp.link.link!=null) {
				temp=temp.link;
			}
			System.out.println("Element deleted is "+temp.link.data);
			temp.link=null;
		}
	}
	
	public void insertfront() {
		//creating a node
		System.out.println("Enter an Elment");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		
		if(first==null) {
			first=newnode;
		}
		else {
			newnode.link=first;
			first=newnode;
		}
	}
	
	public void deletefront() {
		if(first==null) {
			System.err.println("Deletion not possible!!");
		}
		else if(first.link==null) {
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			System.out.println("Element deleted is "+first.data);
			first=first.link;
		}
	}
	
	public void insertAtIndex() {
		System.out.println("Enter an Index:");
		int index=scan.nextInt();
		System.out.println("enter an Elment:");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		Node temp;
		
		if(first==null) {
			first=newnode;
		}
		if(index<0) {
			System.err.println("Insertion not possible");
		}
		if(index==0) {
			newnode.link=first;
			first=newnode;
			return;
		}
		temp=first;
		for(int i=0;i<index-1 && temp!=null;i++) {
			temp=temp.link;
		}
			newnode.link=temp.link;
			temp.link=newnode;
	}
	
	public void deleteAtIndex() {
	    System.out.println("Enter an Index:");
	    int index = scan.nextInt();

	    if (first == null) {
	        System.err.println("Deletion not possible!!! The list is empty.");
	        return;
	    }

	    if (index < 0) {
	        System.err.println("Deletion not possible!!! Invalid index.");
	        return;
	    }

	    if (index == 0) {
	        System.out.println("Element deleted is " + first.data);
	        first = first.link;
	        return;
	    }

	    Node current = first;
	    Node previous = null;

	    for (int i = 0; i < index && current != null; i++) {
	        previous = current;
	        current = current.link;
	    }

	    if (current == null) {
	        System.err.println("Deletion not possible!!! Invalid index.");
	        return;
	    }

	    System.out.println("Element deleted is " + current.data);
	    previous.link = current.link;
	}

	
	public void display() {
		Node temp;
		if(first==null) {
			System.err.println("Display not possible!!!");
		}
		else if(first.link==null) {
			System.out.println(first.data);
		}
		else {
			System.out.println("++++++++++++++++++");
			temp=first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
			System.out.println("++++++++++++++++++");
		}
	}
}
