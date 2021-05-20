package lambda.practical;

// Functional Interface

//public interface CarCondition {
//	public boolean test(Car c);
//}


//Functional Generic Interface
public interface Condition<T> {
	public boolean test(T t);
}
