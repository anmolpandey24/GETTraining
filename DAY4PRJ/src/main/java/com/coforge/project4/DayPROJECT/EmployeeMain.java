package com.coforge.project4.DayPROJECT;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee empArr[]=new Employee[5];
		Employee e1=new Employee("Anmol",123,70000);
		Employee e2=new Employee("Amit",765,60000);
		Employee e3=new Employee("Rahul",890,80000);
		Employee e4=new Employee("Shreya",768,90000);
		Employee e5=new Employee("Arpita",456,100000);
		
		Employee empArr[]= {e1,e2,e3,e4,e5};
		
		for(Employee emp:empArr)
			System.out.println(emp);
		
		Consumer<Employee[]> empConsumer=(empArr1)->{
			for(Employee emp:empArr) {
				System.out.println(emp.getEname());
			}
			
		};
		empConsumer.accept(empArr);

	}

}
