package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate template;

	public int insert(Student student) {
		String query = "insert into student(id, name, city) values(?,?,?)";
		int r = template.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public int change(Student student) {
		String query = "update student set name = ? where id = ?";
		int r = template.update(query,student.getName(), student.getId());
		return r;
	}
	
	public int delete(int studentId) {
		String query = "delete from student where id = ?";
		int r = template.update(query, studentId);
		return r;
	}

	public Student getStudent(int studentId) {
		String query = "select * student where id = ?";
		int r = template.queryForObject(query,rowMapper, studentId);
		return r;
	}
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
}
