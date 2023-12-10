
public class Car {
	
	Engine engine=new Engine("Turbo","cc2400");
	
	String brand;
	String color;
	int cost;
	public Car(String brand, String color, int cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	
	
	
}
