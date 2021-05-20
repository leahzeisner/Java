
public class Zoo {

	public static void main(String[] args) {
		Pig pig = new Pig(2, "female", 50);
		pig.oink();
		pig.sleep();
		
		Bird bird = new Bird(1, "nonbinary", 5);
		bird.eat();
		
		Chicken chicken = new Chicken(4, "male", 7);
		chicken.eat();
		chicken.move();
		
		Sparrow sparrow = new Sparrow(3, "female", 6);
		sparrow.fly();
		
		moveAnimals(sparrow);
		
		Flyable flyingBird = new Sparrow(1, "male", 4);
		flyingBird.fly();

	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}

}
