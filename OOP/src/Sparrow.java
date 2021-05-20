
public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String gender, int weightInPounds) {
		super(age, gender, weightInPounds);
	}

	@Override
	public void fly() {
		System.out.println("Sparrow is flying...");
		
	}

}
