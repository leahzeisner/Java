package client;

public class Container<I1, I2> {
	
	I1 item1;
	I2 item2;
	
	public Container(I1 item1, I2 item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void printItems() {
		System.out.println("Printing contents of container...");
		System.out.println("Item 1: " + item1);
		System.out.println("Item 2: " + item2);
	}

	public I1 getItem1() {
		return item1;
	}

	public void setItem1(I1 item1) {
		this.item1 = item1;
	}

	public I2 getItem2() {
		return item2;
	}

	public void setItem2(I2 item2) {
		this.item2 = item2;
	}
	
	
		
	

}
