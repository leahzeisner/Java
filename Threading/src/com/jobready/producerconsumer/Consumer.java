package com.jobready.producerconsumer;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> questions = null;
	
	public Consumer(List<Integer> questions) {
		this.questions = questions;
	}
	
	
	public void answerQuestion() throws InterruptedException {
		
		synchronized (questions) {
			while (questions.isEmpty()) {
				System.out.println("No questions to answer... waiting for Producer to get questions.");
				questions.wait();
			}
		}
		
		synchronized (questions) {
			Thread.sleep(5000);
			System.out.println("ANSWERED Question: " + questions.remove(0));
			questions.notify();
		}
	}
	

	@Override
	public void run() {
		
		while (true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
