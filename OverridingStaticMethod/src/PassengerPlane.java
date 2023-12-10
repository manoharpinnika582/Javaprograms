
public class PassengerPlane extends Plane{
	@Override
	public void fly() {
		System.out.println("Passenger plane is flying.");
	}
	
	//@override gives error:override cannot be resolved to a type
	static public void carrySomething() {
		System.out.println("Passenger plane is carrying passengers.");
	}
}
