package com.jobready.threading;

public class Application {

	public static void main(String[] args) {
		
//		System.out.println("Starting thread 1");  
//		
//		Task task = new Task("Thread-A");
//		task.start();
//		
//		System.out.println("Starting thread 2"); 
//
//		
//		Task task2 = new Task("Thread-B");
//		task2.start();
		
		
		System.out.println("Starting thread 1");  
		
		Task task = new Task("Thread-A");
		Thread thread1 = new Thread(task);
		thread1.start();
		
		System.out.println("Starting thread 2"); 

		
		Task task2 = new Task("Thread-B");
		Thread thread2 = new Thread(task2);
		thread2.start();
		
	}

}


//class Task extends Thread {
//	
//	String name;
//	
//	public Task(String name) {
//		this.name = name;
//	}
//	
//	public void run() {
//		Thread.currentThread().setName(this.name);
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("Number: " + i + " " + this.getName());
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
//}


class Task implements Runnable {
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 1000; i++) {
			System.out.println("Number: " + i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
