package com.acts.stack;

import com.acts.stackinterface.StackInterface;

public class StackImplementation<T> implements StackInterface<T> {

	int top = -1, size;
	Object [] arr;

	
	public StackImplementation() {
		super();
	}

	public StackImplementation(int size) {
		super();
		this.size = size;
		this.arr = new Object[size];
	}

	@Override
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}

	@Override
	public boolean isFul() {
		if(top == size-1)
			return true;
		else
			return false;
	}

	@Override
	public void push (T num) throws OverFlowException {
		if(this.isFul()) {
			throw new OverFlowException("Stack is full");		
		}
		else
		{
			top++;
			this.arr[this.top] = num;			
			//System.out.println("Inserted element into stack: "+num);
		}
	}

	@Override
	public T pop() throws UnderFlowException {
		Object num = -1;
		if(this.isEmpty()) {
			throw new UnderFlowException("Stack is empty");
		}
		else {
			num = (T) this.arr[this.top];
			top--;
		}
		return (T) num;
	}

	@Override
	public T peek() {
		if(this.isEmpty()) {
			System.out.println("stack is overflow");
		}
		return (T) this.arr[this.top];
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
}
