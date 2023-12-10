class C{
	String name;
	static class B{
		int no;
	}
}
public class InnerClassStatic {
	public static void main(String[] args) {
		C.B ab= new C.B();
		ab.no=102;
		System.out.println(ab.no);
	}
}
