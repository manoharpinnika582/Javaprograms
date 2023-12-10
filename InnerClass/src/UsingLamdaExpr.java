
public class UsingLamdaExpr {
	public static void main(String[] args) {
		K a=new K() {
			@Override
			public void show() {
				System.out.println("Hello Using interface");
			}
		};
		a.show();
		//logic 2
//		K k=() ->{
//			System.out.println("HELLO");
//		};
		
		//logic 3
//		K k=()->System.out.println("HELLOOOOO");
//		k.show();
		
//		Logic 4
//		L l=new L();
//		l.show();
	}
}

//allow only one method
@FunctionalInterface
interface K{
	void show();
	
}

//or implements K
//class L implements K{
//	@Override
//	public void show() {
//		System.out.println("Hello using Object");
//	}
//}