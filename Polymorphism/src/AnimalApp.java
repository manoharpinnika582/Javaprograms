
public class AnimalApp {

	public static void main(String[] args) {
		Animals animal=new Animals();
		animal.acceptAnimal(new Tiger());
		animal.acceptAnimal(new Dear());
		animal.acceptAnimal(new Monkey());
	}

}
