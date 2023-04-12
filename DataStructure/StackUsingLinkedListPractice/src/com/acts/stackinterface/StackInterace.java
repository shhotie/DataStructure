package com.acts.stackinterface;

public interface StackInterace<T> {

	public void push(T data);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public boolean isFull();
}
