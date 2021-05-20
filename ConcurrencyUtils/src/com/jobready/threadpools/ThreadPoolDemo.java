package com.jobready.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);  // recycles threads
		
		Runnable processor = new MessageProcessor(2);
		executor.execute(processor);
		
		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 = new MessageProcessor(4);
		executor.execute(processor4);
		
		executor.shutdown();  	// Rejects any new tasks from being submitted, and shuts down the service
//		executor.shutdownNow(); // Terminates the executor service immediately
		
		while (!executor.isTerminated()) {
			// wait for executor to terminate
		}
		System.out.println("Submitted all tasks.");

	}

}
