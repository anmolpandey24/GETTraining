package com.coforge.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.coforge.entities.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class EmployeeDAO implements EmployeeDaoInterface{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void init() {
		System.out.println("Employee Dao Bean created , @PostConstruct called");
		
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Employee Dao Bean is being destroyed @PreDestroy invoked");
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		String query="select* from emp_tab";
		RowMapper<Employee> rowMapper=(rs,rowNum)->{
			
			Employee e=new Employee();
			e.setEid(rs.getLong("eid"));
			e.setEname(rs.getString("ename"));
			e.setSalary(rs.getDouble("salary"));
			return e;
			
		};
		return jdbcTemplate.query(query, rowMapper);
		
	}

	@Override
	public void insertEmployee(Employee employee) {
		String query="insert into emp_tab(eid,ename,salary) values(?,?,?)";
		jdbcTemplate.update(query,employee.getEid(),employee.getEname(),employee.getSalary());
		System.out.println("row inserted");
		
	}

	@Override
	public Employee getEmployeeById(long eid) {
		
		String query="select * from emp_tab where eid=?";
		RowMapper<Employee> rowMapper=(rs,rowNum)->{
			Employee e=new Employee();
			e.setEid(rs.getLong("eid"));
			e.setEname(rs.getString("ename"));
			e.setSalary(rs.getDouble("salary"));
			return e;
		};
		
		return jdbcTemplate.queryForObject(query,rowMapper,eid);
	}

	@Override
	public void updateEmployee(long eid, Employee employee) {
		String query="update emp_tab set salary=? where eid=?";
		jdbcTemplate.update(query,employee.getSalary(),eid);
		System.out.println("Row updated");
		
	}

	@Override
	public void deleteEmployee(long eid) {
		String query="delete from emp_tab where eid=?";
		jdbcTemplate.update(query,eid);
		System.out.println("row deleted");
		
	}
	
	
	

}
