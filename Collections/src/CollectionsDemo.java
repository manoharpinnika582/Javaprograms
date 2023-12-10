import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("=============================");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("=============================");
		System.out.println("ArrayList al="+al);
		ArrayList al2=new ArrayList();
		al2.add("One");
		al2.add("Two");
		al2.add("Three");
		al2.add("Four");
		al2.add("Five");
		System.out.println("ArrayList al2="+al2);
		System.out.println("=============================");
		//al2.addAll(al);
		//System.out.println("Copying all the element into another list: "+al2);
		al2.addAll(2,al);
		System.out.println("Copying all the element into another list with specified index: "+al2);
		System.out.println("=============================");
		System.out.println(al.contains(50));
		System.out.println("=============================");
		System.out.println(al.get(2));
		System.out.println("=============================");
		System.out.println(al.indexOf(50));
		System.out.println("=============================");
		System.out.println(al.remove(1));
		System.out.println("=============================");
		System.out.println(al.isEmpty());
		System.out.println("=============================");
		al.set(1, 22);
		System.out.println(al);
		System.out.println("=============================");
		System.out.println(al.size());
		System.out.println("=============================");
		
	}
}
