package java_basics;


public class Methods {

	public static void main(String[] args) {
		MyUtils.printStuff();
		MyUtils.printGivenStuff("Given stuff");
		
		MyUtils myVar = new MyUtils();
		int sum = myVar.getSum(5, 2);
		System.out.println(sum);
	}

}
