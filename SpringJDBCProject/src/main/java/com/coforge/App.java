package com.coforge;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.dao.EmployeeDAO;
import com.coforge.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDAO dao=context.getBean(EmployeeDAO.class);
        
        Scanner sc=new Scanner(System.in);
        int choice=0;
        System.out.println("Menu Driven Application");
        
        do {
        	System.out.println("\n1. show all employees");
        	System.out.println("\n2. insert employee");
        	System.out.println("\n3. get employee by id");
        	System.out.println("\n4. update employee");
        	System.out.println("\5. delete employee");
        	System.out.println("\n6. exit");
        	System.out.println("select an option: ");
        	choice=sc.nextInt();
        	switch(choice) {
        	case 1:
        		dao.getAllEmployees().forEach(e->System.out.println(e));
        	    break;
        	case 2:
        		Employee emp=new Employee(127,"Abhay",60000.0);
        	    dao.insertEmployee(emp);
        		break;
        	case 3:
        		System.out.println("Enter ID to search");
        		int id=sc.nextInt();
        		dao.getEmployeeById(id);
        		break;
        	case 4:
        		Employee upemp=new Employee(550000);
        		dao.updateEmployee(125, upemp);
        		break;
        	case 5:
        		dao.deleteEmployee(125);
        		break;
        	case 6:
        		System.out.println("Exiting.....");
        		break;
        	default:
        		System.out.println("please enter correct operation");
        		
        		
        	}
        }while(choice!=6);
        
//        Employee emp=new Employee(125,"Aman",90000.0);
//        
//        dao.insertEmployee(emp);
//        System.out.println("get all employees");
//        dao.getAllEmployees().forEach(e->System.out.println(e));
//        System.out.println("retrieving one record using getEmployeeById");
//        System.out.println(dao.getEmployeeById(125));
        
//        System.out.println("updating ");
//        Employee upemp=new Employee(800000);
//        dao.updateEmployee(125, upemp);
//        
        
//        dao.deleteEmployee(125);
//        
//        
//        System.out.println("get all employees");
//        dao.getAllEmployees().forEach(e->System.out.println(e));
        context.close();
    }
}
