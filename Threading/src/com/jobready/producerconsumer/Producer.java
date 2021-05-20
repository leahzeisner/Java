package com.jobready.producerconsumer;

import java.util.List;

public class Producer implements Runnable {
	
	List<Integer> questions = null;
	final int LIMIT = 5;
	private int questionNum;
	
	public Producer(List<Integer> questions) {
		this.questions = questions;
	}
	
	
	public void readQuestion(int questionNum) throws InterruptedException {
		
		synchronized (questions) {
			while (questions.size() == LIMIT) {
				System.out.println("Questions have piled up... wait for answers.");
				questions.wait();
			}
		}
		
		synchronized (questions) {
			System.out.println("New Question: " + questionNum);
			questions.add(questionNum);
			Thread.sleep(100);
			questions.notify();
		}
	}
	

	@Override
	public void run() {
		
		while (true) {
			try {
				readQuestion(questionNum++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
