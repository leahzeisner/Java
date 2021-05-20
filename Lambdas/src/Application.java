
public class Application {

	public static void main(String[] args) {
		
		Human tom = new Human();
		walker(tom);
		
		Robot walle = new Robot();
		walker(walle);
		
	
		
//		walker(new Walkable() {
//
//			@Override
//			public void walk() {
//				System.out.println("Custom Object is walking...");
//				
//			}
//			
//		});
		
		walker( () -> {
			System.out.println("Custom Object is walking...");
			System.out.println("Custom Object tripped...");
		});
		
		
		Walkable aBlockOfCode = () -> System.out.println("A block of code executing...");
		walker(aBlockOfCode);
		
		
		
		
		
		LambdaInterface helloVar = () -> System.out.println("Hello there...");
		helloVar.someMethod();
		
		
		
		
		
		Calculate sumVar = (num1, num2) -> num1 + num2;
		System.out.println(sumVar.compute(5, 3));
		
		Calculate divideVar = (num1, num2) -> {
			if (num1 == 0) {
				return 0;
			}
			return num1 / num2;
		};
		System.out.println(divideVar.compute(10, 2));
		
		
		
		
		
//		StringWorker reverseVar = (str) -> {
//			String result = "";
//			for (int i = str.length() - 1; i >= 0; i--) {
//				result += str.charAt(i);
//			}
//			return result;
//		};
//		System.out.println(reverseVar.work("hello"));
		
		MyGenericInterface<String> reverseVar = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println(reverseVar.work("hello"));
		
		
		
		
		
//		NumberWorker factorialVar = (num) -> {
//			int result = 1;
//			for (int i = 1; i<= num; i++) {
//				result *= i;
//			}
//			return result;
//		};
//		System.out.println(factorialVar.work(5));
		
		MyGenericInterface<Integer> factorialVar = (num) -> {
			int result = 1;
			for (int i = 1; i<= num; i++) {
				result *= i;
			}
			return result;
		};
		System.out.println(factorialVar.work(5));

	}
	
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
	
	
	public void sayHello() {
		System.out.println("Hello there...");
	}
	
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	
	public int nonZeroDivide(int num1, int num2) {
		if (num1 == 0) {
			return 0;
		}
		return num1 / num2;
	}
	
	
	public String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
	
	
	public int factorial(int num) {
		int result = 1;
		for (int i = 1; i<= num; i++) {
			result *= i;
		}
		return result;
	}

}
