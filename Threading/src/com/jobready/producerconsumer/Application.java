package com.jobready.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> questions = new ArrayList<Integer>();
		
		Thread t1 = new Thread(new Producer(questions));
		Thread t2 = new Thread(new Consumer(questions));
		
		t1.start();
		t2.start();

	}

}
