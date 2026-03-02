package com.coforge.day5project5.DAY5PROJECT;

public class StudentClass implements Comparable<StudentClass> {
	private int sid;
	private String sname;
	private double marks;
	public StudentClass() {
		super();
	}
	public StudentClass(int sid, String sname, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentClass [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(StudentClass o) {
		
		return this.sid-o.sid;
	}
	
	
	
	

}
