package com.coforge.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.coforge.entities.Student;

@Component
public class StudentDao implements StudentDaoInterface {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> getAll() {
		
		String query="select * from student";
		List<Student> sList=new ArrayList<Student>();
		RowMapper<Student> rowMapper=(rs,rows)->{
			Student s=new Student();
			s.setSid(rs.getLong("sid"));
			s.setSname(rs.getString("sname"));
			s.setCourse(rs.getString("course"));
			s.setAddress(rs.getString("address"));
		    return s;
		};
		return jdbcTemplate.query(query,rowMapper);
	}

	@Override
	public String save(Student student) {
		
		String query="insert into student (sname,course,address) values(?,?,?)";
		jdbcTemplate.update(query,student.getSname(),student.getCourse(),student.getAddress());
		return "row inserted";
		
		
	}

	@Override
	public Student getById(long sid) {
		
		String query="select * from student where sid=?";
		RowMapper<Student> rowMapper=(rs,rows)->{
			Student s=new Student();
			s.setSid(rs.getLong("sid"));
			s.setSname(rs.getString("sname"));
			s.setCourse(rs.getString("course"));
			s.setAddress(rs.getString("address"));
		    return s;
		
		
		
	};
	
	return jdbcTemplate.queryForObject(query, rowMapper,sid);
	}

}
