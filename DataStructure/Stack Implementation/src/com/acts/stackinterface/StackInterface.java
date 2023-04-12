package com.acts.stackinterface;

import com.acts.stack.OverFlowException;
import com.acts.stack.UnderFlowException;

public interface StackInterface<T> {

	public boolean isEmpty();
	public boolean isFul();
	public void push(T num)throws OverFlowException;
	public T pop() throws UnderFlowException;
	public T peek();
}
