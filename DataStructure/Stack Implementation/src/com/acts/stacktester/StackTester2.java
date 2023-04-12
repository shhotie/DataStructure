package com.acts.stacktester;
import static com.acts.studentutil.StudentUtil.*;
import com.acts.stack.StackImplementation;
import com.acts.stack.Student;

public class StackTester2 {

	public static void main(String[] args) {

		StackImplementation<Student> stack = populateDate();
		while(stack.getTop()!=-1)
		{
			System.out.println(stack.pop());
		}
	}

}
