package com.jobready.threading;

public class Sequence {
	
	private int value = 0;
	
	public Sequence() {
		this.value = value;
	}
	
	
	
//	public int getNext() {
//		// NOT THREAD SAFE
//		// this.value++;
//		// return this.value;
//		
//		
//		// do all or nothing
//		// locks 'this', execute all lines without stopping,
//		// no other thread can be given control until the block is over
//		synchronized (this) {
//			this.value++;  // not thread safe
//			return this.value;
//		}
//		
//	}
	
	
	
	// or add 'synchronized' to method signature
	public synchronized int getNext() {
		 this.value++;
		 return this.value;		
	}

}
