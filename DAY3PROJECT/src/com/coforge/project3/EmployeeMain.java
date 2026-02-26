package com.coforge.project3;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Anmol",123,20000);
		Employee e2=new Employee("Deepu",456,30000);
		Employee e3=new Employee("Rahul",789,40000);
		//Employee.companyName="KPMG";
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		e1.calSalary();
		e2.calSalary();
		e3.calSalary();
		
		

	}

}
