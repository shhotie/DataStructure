package com.acts.qinterface;

public interface GenericQinterface <T> {

	//only method declaration.
	//queue- front->delete, rear->input
	
	public boolean isEmpty();
	public boolean isFull();
	public void enQueue(T data);
	public T deQueue();
	public T getFront();
	public T getRear();
}
