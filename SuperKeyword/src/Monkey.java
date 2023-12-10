
public class Monkey extends Animal {
	String name="Monkey";
	public void eat() {
		System.out.println(super.name);
		super.eat();
		System.out.println("Monkey is eating..");
	}
}
