package com.acts.qinterface;

public interface Qinterface {

	public boolean isEmpty();
	public boolean isFull();
	public void enQueue(int num);
	public int deQueue();
	public int getFront();
	public int getRear();

}
