package com.springcore.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springcore.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(Student student) {
		String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	public int update(Student student) {
		String query = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}
	public Student getStudent(int id) {
		String query = "select * from student where id=?";
		Student student = this.jdbcTemplate.queryForObject(query, new RowMapperImpl(), id);
		return student;
	}
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
}