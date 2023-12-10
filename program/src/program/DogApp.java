package program;

public class DogApp {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.sleep();
		d.bark();
		
		System.out.println("=============================");
		
		Dog d2=new Dog("Rockey");
		d2.eat();
		d2.sleep();
		d2.bark();
System.out.println("=============================");
		
		Dog d3=new Dog("Goldy","GR");
		d3.eat();
		d3.sleep();
		d3.bark();
System.out.println("=============================");
		
		Dog d4=new Dog("Whity","GR",10,"White");
		d4.eat();
		d4.sleep();
		d4.bark();
System.out.println("=============================");
		
		Dog d5=new Dog("Whity",15);
		d5.eat();
		d5.sleep();
		d5.bark();
		
	System.out.println("=============================");
	
	Dog d6=new Dog();
	d6.eat();
	d6.sleep();
	d6.bark();
	System.out.println("=============================");
	
	Dog d7=new Dog("Puppy","GR","White",2);
	d7.eat();
	d7.sleep();
	d7.bark();

	System.out.println("=============================");
	
	Dog d8=new Dog(12,"chintu","white");
	d8.eat();
	d8.sleep();
	d8.bark();
	
	System.out.println("=============================");
	
	Dog d9=new Dog(10,"WhiteBlack");
	d9.eat();
	d9.sleep();
	d9.bark();
	}

}
