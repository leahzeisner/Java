package com.jobready.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	int questionNum;
	BlockingQueue<Integer> questionQueue;
	
	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		
		while (true) {
			try {
				synchronized (this) {
					int nextQuestion = questionNum++;
					System.out.println("Got new question: " + nextQuestion);
					questionQueue.put(nextQuestion);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}