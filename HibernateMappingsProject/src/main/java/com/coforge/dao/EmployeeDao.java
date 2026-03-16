package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Employee;
import com.coforge.utils.HibernateUtil;

public class EmployeeDao {
	
	public List<Employee> getAllEmployee(){
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("from Employee",Employee.class).list();
			 
		}
	}
	
	
	public void insertEmployee(Employee employee) {
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			tx=session.beginTransaction();
			session.persist(employee);
			tx.commit();
			
			 
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public Employee getEmployeeById(long eid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Employee.class, eid);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void deleteEmployee(long eid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			
			session.delete(getEmployeeById(eid));
			tx.commit();
			System.out.println("Employee deleted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateEmployee(Employee employee) {
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			tx=session.beginTransaction();
			session.merge(employee);
			tx.commit();
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
