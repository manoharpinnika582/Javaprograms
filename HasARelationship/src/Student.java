
public class Student extends Human{
	Car ref;
	public void hasA(Car ref) {
		this.ref=ref;
		System.out.println(ref.getBrand());
		System.out.println(ref.getColor());
		System.out.println(ref.getCost());
	}
	
	Book bk;
	public void hasA(Book bk) {
		this.bk=bk;
		System.out.println(bk.getAuthor());
		System.out.println(bk.getName());
		System.out.println(bk.getPrice());
	}
}
