package com.jobready.threading;

public class Application2 {

	public static void main(String[] args) {
		
		Sequence seq = new Sequence();
		
		Worker worker = new Worker(seq);
		worker.start();
		
		Worker worker2 = new Worker(seq);
		worker2.start();

	}

}


class Worker extends Thread {
	
	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	@Override 
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " got value: " + sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
