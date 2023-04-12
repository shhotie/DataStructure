package com.acts.queueinterface;

public interface QueueInterface<T> {

	public void enQueue(T data);
	public T deQueue();
	public T peek();
	public boolean isEmpty();
	public boolean isFull();
}
