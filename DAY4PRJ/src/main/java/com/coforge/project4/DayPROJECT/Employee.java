package com.coforge.project4.DayPROJECT;

public class Employee {
	
	private String ename;
	private int eid;
	private double salary;
	public Employee(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
