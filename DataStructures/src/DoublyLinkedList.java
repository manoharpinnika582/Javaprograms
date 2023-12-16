import java.util.Scanner;


public class DoublyLinkedList {
	class Node{
		private Node prevlink;
		private int data;
		private Node nextLink;
	}
	private Node first;
	private Scanner scanner=new Scanner(System.in);
	public void insert_rear(){
		Node temp;
		System.out.println("Enter an Element");
		int elem=scanner.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.prevlink=null;
		newnode.nextLink=null;
		if(first==null) {
			first=newnode;
		}
		else {
			temp=first;
			while(temp.nextLink!=null) {
				temp=temp.nextLink;
			}
			temp.nextLink=newnode;
			newnode.prevlink=temp;
		}
	}
	public void delete_rear() {
	    if (first == null) {
	        System.out.println("Deletion not possible");
	    } else if (first.nextLink == null) {
	        System.out.println("Element deleted is " + first.data);
	        first = null;
	    } else {
	        Node temp = first;
	        while (temp.nextLink != null && temp.nextLink.nextLink != null) {
	            temp = temp.nextLink;
	        }

	        if (temp.nextLink != null) {
	            System.out.println("Element deleted is " + temp.nextLink.data);
	            temp.nextLink = null;
	        } else {
	            System.out.println("Deletion not possible");
	        }
	    }
	}

	public void insert_front() {
		System.out.println("Enter an Element");
		int elem=scanner.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.prevlink=null;
		newnode.nextLink=null;
		if(first==null) {
			first=newnode;
		}
		else {
			newnode.nextLink=first;
			first.prevlink=newnode;
			first=newnode;
			
		}
	}
	public void delete_front() {
		if(first==null) {
			System.out.println("Deletion not possible");
		}
		else if(first.nextLink==null) {
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			System.out.println("Element deleted is "+first.data);
			first=first.nextLink;
			first.prevlink=null;
		}

	}
	public void insertAtIndex() {
		System.out.println("Enter an Index:");
		int index=scanner.nextInt();
		System.out.println("enter an Elment:");
		int elem=scanner.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.prevlink=null;
		newnode.nextLink=null;
		Node temp;
		
		if(first==null) {
			first=newnode;
		}
		if(index<0) {
			System.err.println("Insertion not possible");
		}
		if(index==0) {
			if(first!=null) {
				newnode.nextLink=first;
				first.prevlink=newnode;
			}
			first=newnode;
			return;
		}
		temp=first;
		for(int i=0;i<index-1 && temp!=null;i++) {
			temp=temp.nextLink;
		}
			newnode.nextLink=temp.nextLink;
			if(temp.nextLink!=null) {
				temp.nextLink.prevlink=newnode;
			}
			temp.nextLink=newnode;
			newnode.prevlink=temp;
	}
	public void deleteAtIndex() {
	    System.out.println("Enter an Index to delete:");
	    int index = scanner.nextInt();

	    if (index < 0) {
	        System.err.println("Deletion not possible");
	        return;
	    }

	    if (first == null) {
	        System.err.println("List is empty, nothing to delete");
	        return;
	    }

	    if (index == 0) {
	        if (first.nextLink != null) {
	            first.nextLink.prevlink = null;
	        }
	        first = first.nextLink;
	        return;
	    }

	    Node temp = first;
	    for (int i = 0; i < index && temp != null; i++) {
	        temp = temp.nextLink;
	    }

	    if (temp == null) {
	        System.err.println("Index out of bounds");
	        return;
	    }

	    if (temp.nextLink != null) {
	        temp.nextLink.prevlink = temp.prevlink;
	    }

	    if (temp.prevlink != null) {
	        temp.prevlink.nextLink = temp.nextLink;
	    }
	}

	public void display_forward() {
		Node temp;
		if(first==null) {
			System.out.println("Display not possible");
		}
		else if(first.nextLink==null) {
			System.out.println(first.data);
		}
		else {
			temp=first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.nextLink;
			}
			System.out.println();
		}

	}
	public void display_reverse() {
		Node temp;
		if(first==null) {
			System.out.println("Display not possible");
		}
		else if(first.nextLink==null) {
			System.out.println(first.data);
		}
		else {
			temp=first;
			while(temp.nextLink!=null) {
				temp=temp.nextLink;
			}
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.prevlink;
			}

		}
		System.out.println();
	}
}
