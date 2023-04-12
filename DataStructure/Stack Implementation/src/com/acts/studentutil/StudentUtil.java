package com.acts.studentutil;

import com.acts.stack.StackImplementation;
import com.acts.stack.Student;

public class StudentUtil {

	public static  StackImplementation<Student> populateDate(){
		StackImplementation<Student> stack = new StackImplementation<>(10);//empty stack with initial capacity=10.
		stack.push(new Student("Abhishek", "DAC", "CDAC"));
		stack.push(new Student("Agam", "DAC", "CDAC"));
		stack.push(new Student("Akshansh", "DAC", "CDAC"));
		stack.push(new Student("Shazeb", "DAC", "CDAC"));
		stack.push(new Student("Satyam", "DAC", "CDAC"));
		stack.push(new Student("Prabhat", "DAC", "CDAC"));
		return stack;
	}
}
