import java.util.*;

public class LinkedListDS {

	public static void main(String[] args) {

		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(2);
		l1.add(8);
		l1.add(10);
		System.out.println(l1);
		l1.add(2, 7);
		System.out.println(l1);
		l1.addFirst(15);
		l1.addLast(19);
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1.contains(10));
		System.out.println(l1.contains(45));
		System.out.println(l1.indexOf(7));
		System.out.println(l1.remove(4));
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		//l1.removeAll(l1);
		System.out.println(l1.get(0));	
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(40);
		l2.add(50);
		l2.add(60);
		l1.addAll(l2);
		System.out.println(l1);
		l1.sort(null);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println("-------------Stack Data Structure--------------");
		Stack<String> s1=new Stack<String>();
		s1.add("manu");
		s1.push("keerthi");
		s1.push("Nani");
		s1.push("Samantha");
		System.out.println(s1);
//		s1.pop();
//		System.out.println(s1);
//		s1.remove(1);
//		System.out.println(s1);
		
		System.out.println(s1.search("Nani"));
		System.out.println(s1.search("Samantha"));
		System.out.println(s1.search("keerthi"));
		System.out.println(s1.search("manu"));
		LinkedList<String> l3=new LinkedList<String>();
		l3.addAll(s1);
		Iterator it=l3.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
