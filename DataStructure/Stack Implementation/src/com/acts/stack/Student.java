package com.acts.stack;

public class Student {

	private static int ROLL_NO = 100;
	private int rollNo = ROLL_NO;
	private String name;
	private String course;
	private String instName;
	
	public Student(String name, String course, String instName) {
		super();
		ROLL_NO++;
		this.name = name;
		this.course = course;
		this.instName = instName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", instName=" + instName + "]";
	}
	
}
