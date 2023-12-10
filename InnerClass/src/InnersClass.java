class A{
	String name;
	class B{
		int rool_no;
	}
}
public class InnersClass {
	public static void main(String[] args) {
		A a=new A();
		a.name="Manu";
		System.out.println(a.name);
		
		A.B b=a.new B();
		b.rool_no=101;
		System.out.println(b.rool_no);
	}
}
