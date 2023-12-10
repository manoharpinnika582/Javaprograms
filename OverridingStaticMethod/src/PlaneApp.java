
public class PlaneApp {
	public static void main(String[] args) {
		Plane plane=new PassengerPlane();
		plane.fly();
		plane.carrySomething();//==Plane.carrySomething
		
		//if you want to access passenger plane you will
		// momentarly convert to passengerplane type
		
		((PassengerPlane)(plane)).carrySomething();
	}
}
