 class Hi{
	 public void show() {
		 System.out.println("Hi");
	 }
 }
public class AnonymousClass {
	public static void main(String[] args) {
		Hi h=new Hi() {
			public void show() {
				 System.out.println("H");
			 }
		};
		h.show();
	}
}
