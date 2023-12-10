import java.util.LinkedList;

public class LinkedListDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		System.out.println("=====================");
		ll.add(1,22);
		System.out.println(ll);
		System.out.println("=====================");
		ll.set(1, 25);
		System.out.println(ll);
		System.out.println("=====================");
		System.out.println("Index of= "+ll.indexOf(10));
		System.out.println(ll.contains(10));
		System.out.println("=====================");
		ll.addFirst(10);
		ll.addLast(70);
		ll.contains(20);
		System.out.println(ll.get(1));
		System.out.println(ll.lastIndexOf(10));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.offer(1000));
		System.out.println(ll.offerFirst(5000));
		System.out.println(ll.offerLast(2000));
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll.pop());
		System.out.println(ll.set(0, 9000));
		System.out.println(ll);
	}
}