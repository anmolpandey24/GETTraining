package com.coforge.project3;

public class Employee {
	private String name;
	private int id;
	private  static String companyName="Coforge";
	private double bsalary;
	public Employee() {
		super();
	}
	
	public Employee(String name, int id, double bsalary) {
		super();
		this.name = name;
		this.id = id;
		this.bsalary = bsalary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	
	
	
	public double getBsalary() {
		return bsalary;
	}

	public void setBsalary(double bsalary) {
		this.bsalary = bsalary;
	}

	//public void setCompanyName(String companyName) {
		//this.companyName = companyName;
	//}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + bsalary + "]";
	}
	
	public void calSalary() {
		
		double netSal;
		if(this.bsalary>50000) {
			double hra=0.10;
			double da=0.1;
			netSal=bsalary+bsalary*hra+bsalary*da;
			
		}
		
		else {
			netSal=this.bsalary;
		}
		
		System.out.println(netSal);
	}
	
	
	
	
	
	

}
