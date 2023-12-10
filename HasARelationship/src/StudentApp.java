
public class StudentApp {
	public static void main(String[] args) {
		Car car=new Car("Tayota", "White", 3800000);
		System.out.println(car.engine.type);
		System.out.println(car.engine.bhp);
		
		Book book=new Book("Let Us c", "Yesh", 1000);
		
		Student student=new Student();
		student.hasA(car);
		student.hasA(book);
		
		
		System.out.println(student.heart.color);
		System.out.println(student.heart.weight);
		System.out.println(student.brain.color);
		System.out.println(student.brain.weight);

	}
}
